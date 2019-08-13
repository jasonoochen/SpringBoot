package service;

import domain.User;

import java.util.List;

/*
用户的业务层接口
 */
public interface IUserService {
    /*
    查询所有用户
     */
    List<User> findAllUser();
}
