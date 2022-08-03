package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(){
          public void run(){
              for (int i=0;i<1000;i++){
                  System.out.println("min");
              }
          }
        };

        Thread norm = new Thread(){
            public void run(){
                for (int i=0;i<1000;i++){
                    System.out.println("nom");
                }
            }
        };

        Thread max = new Thread(){
            public void run(){
                for (int i=0;i<1000;i++){
                    System.out.println("max");
                }
            }
        };

        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        min.start();
        norm.start();
        max.start();

    }
}
