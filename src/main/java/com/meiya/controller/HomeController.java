package com.meiya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by panda on 2017/10/8.
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/hello")
    public String index() {
        return "hello";
    }
}
