package com.fan.mybatisPlus.pojo;


import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @TableId(value = "id", type = IdType.AUTO)
    private Long uid;

    private String name;

    private Integer age;

    private String email;

    @TableLogic
    private Integer isDeleted;

    public User(Long uid, String name, Integer age, String email) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
