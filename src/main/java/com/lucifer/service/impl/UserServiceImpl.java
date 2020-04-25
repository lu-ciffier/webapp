package com.lucifer.service.impl;

import com.lucifer.dao.UserDao;
import com.lucifer.domain.UserAccount;
import com.lucifer.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Service
public class UserServiceImpl implements UserService {

    @Value("${host-name}")
    private String userName;
    private final UserDao userDao;



    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Cacheable(value = "user-account", key = "#userId")
    public UserAccount hello(Long userId) {

        return userDao.getUser(userId);
    }
}
