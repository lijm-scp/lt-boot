package com.bokecc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping("/hello")
    public ModelAndView helloWorld(ModelMap model){
        model.addAttribute("result", "abc");
        return new ModelAndView("hello/hello");
    }

    public static void main(String[] args) {
        SpringApplication.run(Booter.class,args);
    }
}
