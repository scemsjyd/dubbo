package cn.com.servyou;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

/**
 * description：
 * Copyright ? 2017 Servyou Software Group Co., Ltd. All rights reserved
 * create by jyd
 * version 1.0
 * 2017/3/23 15:52
 */
public class TestJson {
    public static void main(String[] args) {
        try {
            JSONObject.parseObject("<sfasdf></asdffs>",Object.class);
        } catch (JSONException e) {
            System.out.println("异常");
        }
    }
}
