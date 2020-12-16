package com.imooc.bhh.jvmstudy.asm;


import java.util.concurrent.TimeUnit;

/**
 * @author bhh
 * @description asm练习
 * @date Created in 2020-12-13 17:07
 * @modified By
 */
public class AsmTest {
    public void m1(){
        System.out.println("===========now in method m1============");
        try {
            TimeUnit.MICROSECONDS.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
