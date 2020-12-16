package com.imooc.bhh.jvmstudy.init;

/**
 * @author bhh
 * @description 初始化得类
 * @date Created in 2020-12-14 15:18
 * @modified By
 */
public class MyClass {
    private static MyClass myClass = new MyClass();
    private static int b;
    private int a = 0;

    public MyClass (){
        /*System.out.println("a="+a);
        System.out.println("b="+b);*/
        a++;
        b++;
    }

    public static MyClass getInstance(){
        return myClass;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }
}
