package cn.com.servyou;

import cn.com.servyou.provider.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description：
 * Copyright ? 2017 Servyou Software Group Co., Ltd. All rights reserved
 * create by jyd
 * version 1.0
 * 2017/3/23 10:58
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext atx =
                new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        atx.start();
        HelloService hello = (HelloService) atx.getBean("helloService");
        String msg = hello.hello("world");
        System.out.println(msg);
        System.in.read();

    }
}
