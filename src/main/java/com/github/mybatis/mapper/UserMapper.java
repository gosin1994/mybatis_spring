package com.github.mybatis.mapper;

import com.github.mybatis.domain.User;

/**
 * @Author: Gosin
 * @Date: 2017/12/14 20:48
 */
public interface UserMapper {
    /**
     * 增加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
