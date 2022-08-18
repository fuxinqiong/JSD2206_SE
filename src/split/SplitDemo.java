package split;

import java.util.Arrays;

/**
 * split 拆分字符
 *
 */
public class SplitDemo {
    public static void main(String[] args) {
        //以问号拆分，需要转义，
        String line1= "1?3?4=4?4=55?=?";
        String[] str = line1.split("\\?");

        String line = "1=2=3=4=5=6=7=========";
        String[] data = line.split("=",1);
        System.out.println(Arrays.toString(data));
        String[] data1= line.split("=",2);
        System.out.println(Arrays.toString(data1));
        String[] data2= line.split("=",3);
        System.out.println(Arrays.toString(data2));
        String[] data4= line.split("=",4);
        System.out.println(Arrays.toString(data4));
        String[] data5= line.split("=",5);
        System.out.println(Arrays.toString(data5));
        String[] data10= line.split("=",10);
        System.out.println(Arrays.toString(data10));
        String[] data100= line.split("=",100);
        System.out.println(Arrays.toString(data100));



        //
        String[] data3= line.split("=",-1);
        System.out.println(Arrays.toString(data3));


    }
}
