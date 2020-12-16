package com.imooc.bhh.jvmstudy.stack;

/**
 * @author bhh
 * @description 栈测试
 * @date Created in 2020-12-15 13:07
 * @modified By
 */
public class StackTest {
    public static void main(String[] args) {
        {
//            原 8.5 m 空余
            byte[] b = new byte[1 * 1024 * 1024];
            byte[] b1 = new byte[1 * 1024 * 1024];
        }

        int a = 1;
//        int c = 1;
        System.gc();


        System.out.println("totalMemory=" +
                Runtime.getRuntime().totalMemory()/1024.0/1024.0);
        System.out.println("freeMemory=" +
                Runtime.getRuntime().freeMemory()/1024.0/1024.0);
        System.out.println("maxMemory=" +
                Runtime.getRuntime().maxMemory()/1024.0/1024.0);
    }

    public void add(int a, int b) {

        int c = a + b;
    }
}
