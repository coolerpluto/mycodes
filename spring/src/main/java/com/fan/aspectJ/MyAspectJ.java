package com.fan.aspectJ;

import com.fan.pojo.User;

/**
 * @author: fc
 * @date: 2022/9/30 17:02
 */
public class MyAspectJ {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.toString());
        System.out.println(user);
        Integer nums[] = new Integer[10];
        System.out.println("*******"+nums.toString());

    }
}
