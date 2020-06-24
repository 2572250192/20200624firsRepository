package com.gec.dao;

import com.gec.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> findAllUser();
}
