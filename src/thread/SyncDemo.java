package thread;

/**
 * 多线程并发安全问题
 * 银行取款案例
 * 当多个线程并发操作同一临界资源，由于线程切换实际不确定，导致操作临界资源的完整过程出现混乱，从而导致不良后果
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                    System.err.println("hao " );;
                }
            }

        };


        Thread t2 = new Thread() {
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };

        t1.start();
        t2.start();
    }
}

class Table{
    private int beans = 20;
    public synchronized int getBean(){  //线程加锁，多个线程不同时进入一个方法中
        if (beans==0){
            throw new RuntimeException("没有豆子了");
        }
        return beans--;
    }
}
