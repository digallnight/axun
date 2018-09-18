package com.lqp.axun.controller;

import com.lqp.axun.service.bean.UserInfoList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController：用于将返回值转换成json
//@Controller+@ResponseBody组合，相当于在每个方法都加上@ResponseBody。
@RestController
public class HelloController {
    //直接指定Post请求，同样也有@GetMapping  
    @PostMapping("/url")
    //@RequestBody是指请求来的参数是json格式，以json格式来转换到uer，现在用json传参已经用的越来越多  
    public String hello(@RequestBody UserInfoList userInfoList){
        return "hello world";
    }
}  