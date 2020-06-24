package com.gec.controller;

import com.gec.pojo.User;
import com.gec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")
    public List<User> getUserList(){

        List<User> users = userService.findAllUser();


        return users;
    }
}
