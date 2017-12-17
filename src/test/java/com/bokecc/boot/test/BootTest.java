package com.bokecc.boot.test;

import com.bokecc.boot.mapper.RoleMapper;
import com.bokecc.boot.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lijm on 2017/12/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootTest {
    Logger logger = LoggerFactory.getLogger(BootTest.class);
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    RoleMapper roleMapper;
    @Test
    public void test1(){
        logger.info("student:{}",studentMapper.findStudentByName("lijm").getName());
        logger.info("student:{}",studentMapper.findStudentByName("lijm"));
    }
    public void test2(){
        logger.info("student:{}",studentMapper.findStudentByName("lijm"));
        logger.info("student:{}",studentMapper.findStudentByName("lijm"));
    }
}
