package com.github.mybatis.service;

import com.github.mybatis.domain.User;

/**
 * @Author: Gosin
 * @Date: 2017/12/14 20:52
 */
public interface UserService {
    /**
     * 增加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
