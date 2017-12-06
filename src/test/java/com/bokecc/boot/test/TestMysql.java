package com.bokecc.boot.test;

import com.bokecc.boot.dao.DepartmentRepository;
import com.bokecc.boot.dao.RoleRepository;
import com.bokecc.boot.dao.UserRepository;
import com.bokecc.boot.dto.Department;
import com.bokecc.boot.dto.Role;
import com.bokecc.boot.dto.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;


/**
 * Created by lijm on 2017/12/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaConfiguration.class})
public class TestMysql {
    private static Logger logger = LoggerFactory.getLogger(TestMysql.class);
    @Autowired
    UserRepository userRepository;
    @Autowired
    DepartmentRepository deparmentRepository;
    @Autowired
    RoleRepository roleRepository;

    @Before
    public void initData() {
        userRepository.deleteAll();
        Department deparment = new Department();
        deparment.setName("开发部");
        deparmentRepository.save(deparment);

        Role role = new Role();
        role.setName("工程师");
        roleRepository.save(role);
        List<Role> roles = roleRepository.findAll();


        User user = new User();
        user.setName("user1");
        user.setCreatedate(new Date());
        user.setDeparment(deparment);
        user.setRoles(roles);
        List<User> users = userRepository.findAll();
        Assert.notNull(users, "users.....");
        userRepository.save(user);
        Assert.notNull(user.getId(), "userId.....");
    }

    @Test
    public void findPage() {
        Pageable pageable = new PageRequest(0, 10, new Sort(Sort.Direction.ASC, "id"));
        Page<User> page = userRepository.findAll(pageable);
        Assert.notNull(page, "pages.....");
        for (User user : page.getContent()) {
            logger.info("================user================ user name:{},department name:{},role name:{}",
                    user.getDeparment().getName(), user.getName(), user.getRoles().get(0).getName());
        }
    }
}
