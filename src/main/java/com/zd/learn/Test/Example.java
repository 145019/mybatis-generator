//package com.zd.learn.Test;
//
//import com.taotao.entity.TbItemCat;
//import com.taotao.mapper.TbItemCatMapper;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * @Author zd
// * @Date 2020/4/9 12:52
// * @Version 1.0
// * 描述:
// */
//public class Example {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
//        TbItemCatMapper tbItemCatMapper = context.getBean("tbItemCatMapper", TbItemCatMapper.class);
//        TbItemCat tbItemCat = tbItemCatMapper.selectByPrimaryKey((long) 1);
//        System.out.println(tbItemCat);
//    }
//}
