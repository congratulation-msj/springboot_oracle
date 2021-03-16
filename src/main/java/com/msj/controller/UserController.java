package com.msj.controller;

import com.msj.model.User;
import com.msj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot_oracle
 * @Date: 2021/3/10 15:46
 * @Author: msj
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUserByName/{username}")
    public User findUserByName(@PathVariable("username") String username){
        User user = userService.findUserByName(username);
        return user;
    }
}
