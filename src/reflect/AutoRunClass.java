package reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target 是内置的注解，用于标注当前注解可以被应用的位置、
 * @注解
 * 默认注解
 *
 *
 */
//@AutoRunClass
@Target(ElementType.TYPE)
//@Target({ElementType.TYPE,ElementType.FIELD})
//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER,ElementType.PACKAGE})
//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER,ElementType.PACKAGE,ElementType.CONSTRUCTOR})

/**
 * @Retention(RetentionPolicy.RUNTIME)
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunClass {

}
