package com.zd.learn.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zd
 * @Date 2020/4/9 14:27
 * @Version 1.0
 * 描述:
 */
public class Generator {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        //加载配置文件
        File file = new File("src/main/resources/generatorConfig.xml") ;
        //使用列表来存储日志信息
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        //解析配置文件信息
        Configuration config = cp.parseConfiguration(file);

        DefaultShellCallback callBack = new DefaultShellCallback(true);

        //逆向工程的核心类
        MyBatisGenerator generator = new MyBatisGenerator(config, callBack,warnings  );
        generator.generate(null);
        //打印日志信息
        System.out.println(warnings.toString());
    }
}
