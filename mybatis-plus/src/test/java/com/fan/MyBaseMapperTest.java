package com.fan;

import com.fan.mybatisPlus.MybatisPlusSpringbootApplication;
import com.fan.mybatisPlus.mapper.UserMapper;
import com.fan.mybatisPlus.pojo.User;
import com.fan.mybatisPlus.service.UserService;
import com.fan.mybatisPlus.service.iml.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlusSpringbootApplication.class)
public class MyBaseMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void selectList(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void insertOneUser(){
        int rows = userMapper.insert(new User(null, "a", 12, "a@qq.com"));
        System.out.println("增加User个数"+rows);
    }


    @Test
    public void deleteUserById(){
        int rows = userMapper.deleteById(1575341782403747842L);
        System.out.println("删除User数量是:"+rows);
    }


    @Test
    public void deleteUsersByBatchIds(){
        List<Long> ids = Arrays.asList(1L, 2L, 3L);
        int rows = userMapper.deleteBatchIds(ids);
        System.out.println("批量删除用户数："+rows);
    }


    @Test
    public void deleteUserByMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("age", 24);
        map.put("name", "Billie");
        int i = userMapper.deleteByMap(map);
        System.out.println("删除用户数："+i);
    }


    @Test
    public void updateUserById(){
        int i = userMapper.updateById(new User(4L, "小王", 99, "xiaowang@qq.com"));
        System.out.println("修改成功个数："+i);
    }
}
