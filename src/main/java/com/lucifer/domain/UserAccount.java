package com.lucifer.domain;

import lombok.Data;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

@Component
@Data
public class UserAccount implements RowMapper<UserAccount>, Serializable {

    private Long userId;
    private String fullName;
    private String gender;
    private Timestamp updateTime;

    @Override
    public UserAccount mapRow(ResultSet resultSet, int i) throws SQLException {
        UserAccount account = new UserAccount();
        account.setUserId(resultSet.getLong("user_id"));
        account.setFullName(resultSet.getString("full_name"));
        account.setGender(resultSet.getString("gender"));
        account.setUpdateTime(resultSet.getTimestamp("update_time"));
        return account;
    }
}
