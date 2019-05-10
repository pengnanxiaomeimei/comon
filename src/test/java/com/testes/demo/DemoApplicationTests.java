package com.testes.demo;

import com.testes.demo.dao.UserRepositories;
import com.testes.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {
    @Autowired
    UserRepositories userRepositories;
    @Test
    public void contextLoads() {
        Iterable<User> all = userRepositories.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

}
