package web.controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IUserService;

import java.util.List;

/*
用户的控制
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public List<User> findAllUser(){
        List<User> users = userService.findAllUser();
        return users;
    }
}
