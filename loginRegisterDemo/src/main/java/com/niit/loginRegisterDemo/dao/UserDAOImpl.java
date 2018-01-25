package com.niit.loginRegisterDemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.niit.loginRegisterDemo.model.Login;
import com.niit.loginRegisterDemo.model.User;

public class UserDAOImpl {
	  @Autowired
	  DataSource datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  public void register(User user) {
	    String sql = "insert into users values(?,?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { user.getFirstname(),
	     user.getEmail(),user.getUsername(), user.getPassword(), user.getDOB(),user.getAddress()});
	    }
	    public User validateUser(Login login) {
	    String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()
	    + "'";
	    List<User> users = jdbcTemplate.query(sql, new UserMapper());
	    return users.size() > 0 ? users.get(0) : null;
	    }
	  }
	  class UserMapper implements RowMapper<User> {
	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();
	    user.setUsername(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    user.setFirstname(rs.getString("name"));
	    user.setDOB(rs.getString("dob"));
	    user.setEmail(rs.getString("email"));
	    user.setAddress(rs.getString("address"));
	    return user;
	  }
}
