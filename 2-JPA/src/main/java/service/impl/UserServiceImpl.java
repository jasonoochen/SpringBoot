package service.impl;

import domain.User;
import service.IUserService;

import java.util.List;

public class UserServiceImpl<IUserDao> implements IUserService {

    private IUserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.find;
    }
}
