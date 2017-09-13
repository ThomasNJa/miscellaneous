package cn.hncu.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public MyDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void getPerson() throws Exception {
		Connection con = jdbcTemplate.getDataSource().getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM PERSON");
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getString("name") + " , " + resultSet.getString("age"));
		}
	}

	
	
}
