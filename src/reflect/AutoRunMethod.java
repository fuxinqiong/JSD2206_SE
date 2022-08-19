package reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
    /**
        注解上可以定义参数
        格式:
        类型 参数名() [default 默认值]
        注:[]中的内容可以写也可以不写.
        default用于指定该参数的默认值,指定后,在使用注解时如果不为该参数赋值时则
        采用默认值.例如:
        当我们在@AutoRunMethod上定义一个参数:
        int value() default 1;
        使用时:
        @AutoRunMethod(5): value的值为5
        @AutoRunMethod(3): value的值为3
        @AutoRunMethod: value的值使用默认值1

        但是如果没有指定default,那么使用注解时必须为该参数传值.

        使用注解时,语法要求传递参数时的格式为:
        @注解(参数名1=参数值1[,参数名2=参数值2,....])
        如果一个注解中只有一个参数时,参数名建议选取"value".因为使用时可以不指定
        该参数的名字.
        @AutoRunMethod(1)   由于参数名为value,所以可以这样写.

        如果参数名不叫value,例如:
        int num();
        那么使用时要如下:
        @AutoRunMethod(num=1) 此时参数num的值为1.

     */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunMethod {

    int value();    //注解参数
//    int value() default  1;   //default 默认值,注解未传参时

}
