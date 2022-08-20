package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //1.创建一个线程池，容量为2
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        //2.指派任务
        for (int i = 1; i <=5; i++) {
            Runnable r = new Runnable() {
                public void run() {
                    Thread t = new Thread();
                    System.out.println(t.getName()+":正在执行任务!!!!!!");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(t.getName()+"任务执行完毕!!!!!!!!");
                }
            };
            threadPool.execute(r);
            System.out.println("指派了一个任务给线程池");
        }
//        threadPool.shutdown();
        threadPool.shutdownNow();
        System.out.println("线程池关闭了");



    }
}
