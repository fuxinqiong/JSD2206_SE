package excetion;

/**
 * 异常常用方法
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
    /** ctrl+alt+t 调出快代码输出捷键 */
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("出错了");
//            e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);

//            throw new RuntimeException(e);


        }

        System.out.println("程序结束了");

    }
}
