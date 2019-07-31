package cn.dale.springclouddemo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-hello",fallback = HelloFeignCallback.class)
public interface HelloFeign {
    @GetMapping(value = "/hello")
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}