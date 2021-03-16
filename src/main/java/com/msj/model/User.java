package com.msj.model;

/**
 * @program: springboot_oracle
 * @Date: 2021/3/10 15:49
 * @Author: msj
 * @Description:
 */
public class User {
    private String code;
    private String username;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
