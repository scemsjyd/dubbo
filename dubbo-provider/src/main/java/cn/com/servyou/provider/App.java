package cn.com.servyou.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description：
 * Copyright ? 2017 Servyou Software Group Co., Ltd. All rights reserved
 * create by jyd
 * version 1.0
 * 2017/3/23 11:46
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        ctx.start();
        System.in.read();

    }
}
