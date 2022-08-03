package io;

import java.io.*;

/**
 *
 * Java Bean; 咖啡豆 类指java中类
 * 对象流、
 * ObjectInputStream 、ObjectOutStream
 *
 * 进行对象序列化与反序列化
 *
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        //将一个文件写入person对象写入person.obj中
        Person person = new Person();
        String name = "刘桑";
        int age = 55;
        String gender = "男";
        String[] otherInfo = {"技术好","拍片一流","大家的启蒙老师"};
        Person p  = new Person();
        //定义一个输出文件低级流
        FileOutputStream fos = new FileOutputStream("person.obj");

        /**  序列化一个对象输出流 */
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FileInputStream stream = new FileInputStream("person.obj");




        //
        oos.writeObject(p);     //保存文件
        System.out.println("写出完毕!");
        fos.close();








    }

}
