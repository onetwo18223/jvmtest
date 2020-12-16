package com.imooc.bhh.jvmstudy.init;

/**
 * @author bhh
 * @description 类初始化测试
 * @date Created in 2020-12-14 15:17
 * @modified By
 */
public class ClassInitTest {
    public static void main(String[] args) {
        MyClass myClass = MyClass.getInstance();
        /*System.out.println("a="+myClass.getA());
        System.out.println("b="+myClass.getB());*/
        System.out.println("totalMemory=" +
                Runtime.getRuntime().totalMemory()/1024/1024);
        System.out.println("freeMemory=" +
                Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println("maxMemory=" +
                Runtime.getRuntime().maxMemory()/1024/1024);
    }
}
