package cn.dale.springclouddemo.service;

import org.springframework.stereotype.Component;

/**
 * @Author: dale
 * @Date: 2019/7/26 9:09
 */
@Component
public class HelloFeignCallback implements HelloFeign{

    @Override
    public String sayHelloFromClientOne(String name) {
        return "hello," + name + ",sorry,error!";
    }
}
