package com.whisper;

/**
 * Created by phoenix on 2016/3/26.
 */
public class Test {
    public static void main(String[] args) {
//        Object[] os = new Object[-1];
        char a = 65;
        int charNum = 65;
        char b = (char) charNum;//编译器要求强制转换
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("end");
//        关于变量作用于范围 方法体中的看方法块
        //System.out.println(i);


    }
}
