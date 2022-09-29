package com.fan;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
 * @author: fc
 * @date: 2022/9/29 15:26
 */
@SpringBootTest(classes = MybatisPlusSpringbootApplication.class)
@RunWith(SpringRunner.class)
public class MyPageTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1,5);
        userMapper.selectPage(page,null);
        List<User> list = page.getRecords();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testPageXml(){
        Page<User> page = new Page<>(1,10);
        userMapper.selectPageVo(page, 30);
        List<User> records = page.getRecords();
        for (User record : records) {
            System.out.println(record);
        }
        System.out.println("*************************************************");
        System.out.println("当前页："+page.getCurrent());
        System.out.println("每页显示的条数"+page.getSize());
        System.out.println("总记录数"+page.getTotal());
        System.out.println("总页数"+page.getPages());
        System.out.println("是否有上一页"+page.hasPrevious());
        System.out.println("是否有下一页"+page.hasNext());
    }
}
