package cn.com.servyou.provider.impl;

import cn.com.servyou.provider.HelloService;

/**
 * description：
 * Copyright ? 2017 Servyou Software Group Co., Ltd. All rights reserved
 * create by jyd
 * version 1.0
 * 2017/3/23 11:26
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String msg) {
        return "hello " + msg;
    }
}
