package com.gao.wsp.yuer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: crainnogao
 * @date: 2020/9/8 10:57
 * @version: v1.0
 */
@RestController
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "欢迎棠棠小朋友！";
    }
}
