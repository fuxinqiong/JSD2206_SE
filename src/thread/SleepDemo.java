package thread;

import java.util.Scanner;

/**
    线程的静态方法：
    static void sleep(long ms)
 */
public class SleepDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个时间开始倒计时: ");
        int a = scanner.nextInt();
        System.out.println("start");

            //倒计时开始
        for (int i =a;i>0;i--) {
            System.out.println(i - 1);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



/*        try {
            //倒计时开始
            for (int i =a;i>0;i--){
                System.out.println(i-1);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println("end");
    }

}
