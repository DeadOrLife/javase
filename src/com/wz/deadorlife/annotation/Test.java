package com.wz.deadorlife.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target用来定义你的注解用于什么地方 （例如一个方法或者是一个域）
 * @Retention用来定义该注解用于哪个级别上面，
 * 在源代码中@Retention(RetentionPolicy.SOURCE)
 * 类文件中 @Retention(RetentionPolicy.CLASS)
 * 运行时候 @Retention(RetentionPolicy.RUNTIME)
 *
 *
 * @author wz
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}
