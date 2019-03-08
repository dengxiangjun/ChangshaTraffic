package com.hn.dxj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 控制器类
 *
 * @author dengxiangjun@jd.com
 * @date 2019/3/8 13:07
 **/
@RestController
public class HomeController {

    @GetMapping("test")
    public String test() {
        return "hello world";
    }
}
