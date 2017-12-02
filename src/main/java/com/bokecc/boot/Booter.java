package com.bokecc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lijm on 2017/12/2.
 */
@SpringBootApplication
@RestController
public class Booter {
    @RequestMapping("/")
    public String hello(){
        return "Hello word!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Booter.class,args);
    }
}
