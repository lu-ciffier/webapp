package com.lucifer.dao.impl;

import com.lucifer.dao.UserDao;
import com.lucifer.domain.UserAccount;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public UserAccount getUser(Long userId) {

        return jdbcTemplate.query("select * from user_account",  new UserAccount()).get(0);
    }
}
