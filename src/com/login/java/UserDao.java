package com.login.java;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    // 声明JDBCTemplate对象公用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    public User login(User loginUser) {
        User user;
        String sql = "select * from login where user=? and pwd=?";
        try{
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), loginUser.getUser(), loginUser.getPwd());
        }catch (EmptyResultDataAccessException e){
            return null;
        }

        return user;
    }
}
