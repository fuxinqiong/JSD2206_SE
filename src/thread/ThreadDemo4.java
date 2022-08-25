package thread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("你好");
            }
        });

    }
}
