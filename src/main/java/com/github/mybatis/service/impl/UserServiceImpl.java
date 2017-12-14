package com.github.mybatis.service.impl;

import com.github.mybatis.domain.User;
import com.github.mybatis.mapper.UserMapper;
import com.github.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Gosin
 * @Date: 2017/12/14 20:53
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        int acount = userMapper.addUser(user);
        System.out.println("受影响条数："+acount);

        //制造算术异常，看数据是否回滚
        int q = 0;
        int i = 10/q;
        return acount;
    }

}
