package cn.dale.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: dale
 * @Date: 2019/7/25 15:22
 */
@SpringBootApplication
@EnableEurekaServer
public class MyEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(MyEurekaServer.class,args);
    }
}
