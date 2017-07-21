package yz.learning.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import yz.learning.springboot.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getList() {
        String SQL = "SELECT id, name, score_sum, score_avg, age FROM student;";
        return jdbcTemplate.query(SQL, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setAge(rs.getInt("age"));
                stu.setName(rs.getString("name"));
                stu.setSumScore(rs.getString("score_sum"));
                stu.setAvgScore(rs.getString("score_avg"));
                return stu;
            }
        });
    }
}
