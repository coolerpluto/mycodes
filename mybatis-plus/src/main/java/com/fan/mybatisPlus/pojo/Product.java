package com.fan.mybatisPlus.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: fc
 * @date: 2022/9/29 16:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id;

    private String productName;

    private Integer productPrice;

    @Version
    private Integer version;
}
