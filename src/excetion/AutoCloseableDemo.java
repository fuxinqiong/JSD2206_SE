package excetion;
/**
 * 相当于finallyDemo2的代码
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        /**、特性是编译器认可的，而非虚拟机
         * 自动关闭，实现了Autocloseable
         */
        try (
                FileOutputStream fos =new FileOutputStream("fos.dat");      //实现了Autocloseable 接口的都可以放在这里定义
                ){
            fos.write(1);
        }catch (IOException e){
            System.out.println("出错了");
        }
    }
}
