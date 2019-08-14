package service.impl;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IUserService;
import dao.IUserDao;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }
}
