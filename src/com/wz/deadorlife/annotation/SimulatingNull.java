package com.wz.deadorlife.annotation;

/**
 *  默认值的限制
 *  元素必须具有要么默认值,要么在使用注解的时候提供元素的值
 *
 * 对于非基本类型的元素的值，无论是在源代码中声明时，或者是在注解接口中定义默认值时，都不能以null作为其值
 *
 * @author wz
 */
public @interface SimulatingNull {
    public int id() default -1;
    public String description() default "";
}
