package com.gao.wsp.yuer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/8 10:57
 * @version: v1.0
 */
@RestController
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "欢迎王璟煜小朋友 啦啦啦哈哈哈！";
    }
}
