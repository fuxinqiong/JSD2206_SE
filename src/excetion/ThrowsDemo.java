package excetion;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写超类含有throws声明异常的方法时，对throws 的重写规则
 */
public class ThrowsDemo {

    public void dosome()throws IOException, AWTException{

    }

}
class SubClass extends ThrowsDemo{
    //重写时可以不抛出异常
//    public void dosome() {}

    //重写时可以仅抛出部分异常
//    public void dosome()throws IOException{}

    //重写时可以抛出超类方法抛出的子类型异常
//    public void dosome()throws FileNotFoundException{}

    //不允许抛出额外异常
//    public void dosome()throws SQLException{}

    //不允许抛出比超类方法声明的异常还大的异常，也是父类异常
//    public void dosome()throws Exception{}


}
