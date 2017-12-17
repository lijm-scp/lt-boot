package com.bokecc.boot;

import com.bokecc.boot.mapper.RoleMapper;
import com.bokecc.boot.mapper.StudentMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
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
@MapperScan("com.bokecc.boot.mapper")
@RestController
public class Booter {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private StudentMapper studentMapper;
    @RequestMapping("/")
    public String hello(){
        return "Hello word!";
    }
    @RequestMapping("/hello")
    public ModelAndView helloWorld(ModelMap model){
        model.addAttribute("result", "abc");
        System.out.println(studentMapper.findStudentByName("lijm"));
        return new ModelAndView("hello/hello");
    }

    public static void main(String[] args) {
        SpringApplication.run(Booter.class,args);
    }
}
