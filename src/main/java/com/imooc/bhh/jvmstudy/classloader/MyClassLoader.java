package com.imooc.bhh.jvmstudy.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author bhh
 * @description 自定义类加载器
 * @date Created in 2020-12-14 10:44
 * @modified By
 */
public class MyClassLoader extends ClassLoader {

    private String name = "";

    /**
     * 初始化变量
     *
     * @param name
     */
    public MyClassLoader(String name) {
        this.name = name;
    }

    @Override
    protected Class<?> findClass(
            String name) throws ClassNotFoundException {


        byte[] date = loadClassDate(name);
        //将二进制文件转换为类
        // param name : 全类名 ,
        // param data : 对应的二进制文件 ,
        // param off : 开始位置 ,
        // param len : 长度 ;
        return this.defineClass(name, date, 0, date.length);
    }

    /**
     * 生成对应类名的二进制文件
     *
     * @param clsname
     * @return
     */
    private byte[] loadClassDate(String clsname) {
        byte[] date = null;
        InputStream in = null;
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        clsname = clsname.replace(".", "/");

        try {

            in = new FileInputStream(new File(
                    "F:\\maker\\JAVA\\JavaProject\\workspace01\\jvmstudy\\target/classes/" + clsname + ".class"));

            int a = 0;
            while ((a = in.read()) != -1) {
                out.write(a);
            }

            date = out.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
}
