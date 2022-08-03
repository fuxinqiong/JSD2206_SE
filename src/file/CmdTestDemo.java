package file;

import java.io.IOException;

public class CmdTestDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
//        runtime.exec("c:/Program Files (x86)/bin/软件名称.exe");
        runtime.exec("notepad");    //打开记事本
        runtime.exec("calc");       //打开计算器




    }
}
