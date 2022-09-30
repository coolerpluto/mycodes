package com.fan.exception;
/**
 * 异常介绍
 *  error是指程序中无法处理的错误，此类错误一般表示代码运行时JVM出现问题。
 *  exception程序本身可以捕获并且可以处理的异常。
 *  异常分两种：1、非运行时的异常，比如IOException异常，必须用try-catch处理
*            2、运行时的异常,代码编写的时候不会爆红异常，但是程序运行的时候可能会报异常，比如ArrayIndexOutOfBoundsException
 *              数组越界异常
 * 异常的处理
 *      抛出异常throw、throws
 *      捕获异常try catch finally
 * 异常抛出顺序
 *      method方法->main方法->jvm虚拟机->异常的报错信息打印在控制台
 *
 */

import java.io.File;

/**
 * @author: fc
 * @date: 2022/9/22 13:48
 */
public class MyException extends RuntimeException {
    public static void main(String[] args) {
        //测试运行时异常
        testArithmeticException();
    }

    /**
     * 测试运行时的异常，程序代码编写的时候不会报除0异常，但是运行时候会报错
     */
    static void testArithmeticException(){
        //定义int数组
        int[] a = new int[2];
        a[0] = 10;
        a[1] = 0;
        int n1 = a[0];
        int n2 = a[1];
        try {
            //除0
            int res = n1/n2;
        } catch (ArithmeticException e) {
            System.out.println(123);
            //printStackTrace打印异常类型和位置
            e.printStackTrace();
        }
    }


    static void test(){
        File file = new File("d:\\1.txt");

    }

}
