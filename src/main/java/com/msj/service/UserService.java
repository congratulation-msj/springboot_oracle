package com.msj.service;

import com.msj.model.User;
import org.springframework.stereotype.Service;

/**
 * @program: springboot_oracle
 * @Date: 2021/3/10 15:49
 * @Author: msj
 * @Description:
 */
@Service
public interface UserService {
    User findUserByName(String username);
}
