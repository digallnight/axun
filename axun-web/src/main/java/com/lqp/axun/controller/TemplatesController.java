package com.lqp.axun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
//@Controller：现在要返回的是一个页面，所以不能再用@RestController，而用普通的@Controller
@Controller
@RequestMapping("/")
public class TemplatesController {

    @GetMapping("/templates")
    String test(HttpServletRequest request) {
        //逻辑处理
        request.setAttribute("key", "hello world");
        return "index";
    }
}
