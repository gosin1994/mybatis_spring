package com.github;

import com.github.mybatis.domain.User;
import com.github.mybatis.mapper.UserMapper;
import com.github.mybatis.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Gosin
 * @Date: 2017/12/14 20:55
 */
public class MyBatisTest {
    private UserService userService;
    private ApplicationContext act;

    @Before
    public void init() {
         act = new ClassPathXmlApplicationContext("classpath:spring.xml");
         userService = act.getBean(UserService.class);
    }

    /**
     * 入参为JavaBean
     * 根据用户名模糊查询用户信息
     * @return
     */
    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserage(10);
        user.setUsername("小明同学");
        userService.addUser(user);
    }
}
