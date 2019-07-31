package cn.dale.springclouddemo.controller;

import cn.dale.springclouddemo.service.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    private HelloFeign helloFeign;
    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam String name){
        return helloFeign.sayHelloFromClientOne(name);
    }
}