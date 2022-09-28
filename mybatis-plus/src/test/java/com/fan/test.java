package com.fan;

import com.fan.mybatisPlus.mapper.UserMapper;
import com.fan.mybatisPlus.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class test {

    @Autowired
    UserMapper userMapper;


    @Test
    public void test1(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
