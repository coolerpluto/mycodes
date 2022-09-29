package com.fan;

import com.fan.mybatisPlus.MybatisPlusSpringbootApplication;
import com.fan.mybatisPlus.pojo.User;
import com.fan.mybatisPlus.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: fc
 * @date: 2022/9/29 12:49
 */
@SpringBootTest(classes = MybatisPlusSpringbootApplication.class)
@RunWith(SpringRunner.class)
public class MyServiceImlTest {

    @Autowired
    UserService userService;

    @Test
    public void getAllUsers(){
        List<User> list = userService.list();
        for (User user : list) {
            System.out.println(user);
        }
    }


    @Test
    public void insertUsers(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            User user = new User();
            user.setName("tom"+i);
            user.setAge(i);
            user.setEmail(i+"@qq.com");
            users.add(user);
        }
        boolean b = userService.saveBatch(users);
        System.out.println(b);
    }
}
