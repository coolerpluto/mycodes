package com.fan;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fan.mybatisPlus.MybatisPlusSpringbootApplication;
import com.fan.mybatisPlus.mapper.UserMapper;
import com.fan.mybatisPlus.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Wrapper分为QueryWrapper和UpdateWrapper
 *
 */

/**
 * @author: fc
 * @date: 2022/9/29 13:59
 */
@SpringBootTest(classes = MybatisPlusSpringbootApplication.class)
@RunWith(SpringRunner.class)
public class MyWrapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testQueryWrapper(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("age", 30)
                .le("age", 50);
        List<User> users = userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }


}
