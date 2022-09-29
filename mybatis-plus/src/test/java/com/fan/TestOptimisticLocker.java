package com.fan;

import com.fan.mybatisPlus.MybatisPlusSpringbootApplication;
import com.fan.mybatisPlus.mapper.ProductMapper;
import com.fan.mybatisPlus.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: fc
 * @date: 2022/9/29 16:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlusSpringbootApplication.class)
public class TestOptimisticLocker {

    @Autowired
    ProductMapper productMapper;

    @Test
    public void getAllProducts(){
        List<Product> products = productMapper.selectList(null);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * 添加乐观锁的拦截器后，手动测试，两次获取同一个数据，同时更改
     */
    @Test
    public void test1(){
        Product product1 = productMapper.selectById(1);
        System.out.println("小王获取到的"+product1.getProductName()+"价格是："+product1.getProductPrice());
        Product product2 = productMapper.selectById(1);
        System.out.println("小李获取到的"+product2.getProductName()+"价格是："+product1.getProductPrice());
        product1.setProductPrice(product1.getProductPrice()+1000);
        int i = productMapper.updateById(product1);
        System.out.println("小王修改后的价格："+product1.getProductPrice());
        product2.setProductPrice(product2.getProductPrice()-1000);
        int i1 = productMapper.updateById(product2);
        System.out.println("小李修改后的价格："+product2.getProductPrice());
    }
}
