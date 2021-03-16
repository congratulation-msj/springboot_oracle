package com.msj.dao;

import com.msj.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @program: springboot_oracle
 * @Date: 2021/3/10 15:51
 * @Author: msj
 * @Description:
 */
@Repository
@Mapper
public interface UserDao {

    User findUserByName(@Param("username") String username);
}
