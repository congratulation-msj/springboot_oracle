package com.msj.service.serviceimpl;

import com.msj.dao.UserDao;
import com.msj.model.User;
import com.msj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot_oracle
 * @Date: 2021/3/10 15:50
 * @Author: msj
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String username) {
        return userDao.findUserByName(username);
    }
}
