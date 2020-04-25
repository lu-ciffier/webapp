package com.lucifer.dao;

import com.lucifer.domain.UserAccount;


public interface UserDao {
    
    UserAccount getUser(Long userId);
}
