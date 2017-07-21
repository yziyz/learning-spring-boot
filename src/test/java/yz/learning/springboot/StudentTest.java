package yz.learning.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import yz.learning.springboot.service.StudentService;

import static org.junit.Assert.assertEquals;

/**
 * JUnit测试
 * https://stackoverflow.com/questions/42395225/springapplicationconfiguration-not-found-erroneous-spring-boot-starter-test-con
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootSampleApplication.class)
/*
1.5版本中注解“@SpringApplicationConfiguration”已不存在，使用“@SpringBootTest(classes = SpringBootSampleApplication.class)”代替
 */
@WebAppConfiguration
public class StudentTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void count() {
        assertEquals(studentService.getList().size(), 6);
    }
}
