package com.imooc.bhh.jvmstudy.classloader;

import java.sql.Driver;

/**
 * @author bhh
 * @description 类加载器级别学习
 * @date Created in 2020-12-14 9:56
 * @modified By
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {

        String str = "123";

        Thread thread = new Thread(() -> {
            System.out.println("this in Thread");
        }, "thread1");

        System.out.println("String ClassLoader is :" +
                str.getClass().getClassLoader());

        System.out.println("math ClassLoader is :" +
                thread.getClass().getClassLoader());

        /**
         * 扩展包
         */
        Class<?> clazz = Class.forName("java.sql.Driver");
        System.out.println("Driver ClassLoader is :" +
                clazz.getClassLoader());
        //System.out.println("Driver ClassLoader Parent is:" +
          //      clazz.getClassLoader().getParent());
        /**
         * 非系统包
         */
        ClassLoaderTest test = new ClassLoaderTest();

        System.out.println("ClassLoaderTest ClassLoader is :" +
                test.getClass().getClassLoader());
        System.out.println("ClassLoaderTest ClassLoader Parent is :" +
                test.getClass().getClassLoader().getParent());
        System.out.println("ClassLoaderTest ClassLoader Parent Parent is :" +
                test.getClass().getClassLoader().getParent().getParent());

        /**
         * 自定义类加载器
         */
        MyClassLoader classLoader =
                new MyClassLoader("classLoader");
        //若是这里调用了loadClass()方法，则是由AppClassLoader来处理这个.class文件(双亲委派模型)
        //若是使用了loadClass(),仍要MyClassLoader来处理这个请求，则应该是将.class文件复制到指定的目录，再由MyClassLoader来进行处理
        Class<?> aClass = classLoader.
                loadClass("com.imooc.bhh.jvmstudy.HelloWorld");
        System.out.
                println("MyClassLoader ClassLoader is :" +
                        aClass.getClassLoader());
        System.out.
                println("MyClassLoader ClassLoader parent is :" +
                        aClass.getClassLoader().getParent());
        System.out.
                println("MyClassLoader ClassLoader parent parent is :" +
                        aClass.getClassLoader().getParent().getParent());
    }
}
