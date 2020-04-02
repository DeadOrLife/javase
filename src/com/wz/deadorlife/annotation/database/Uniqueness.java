package com.wz.deadorlife.annotation.database;

/**
 * @author wz
 */
public @interface Uniqueness {
    Constraints constranints() default @Constraints(unique = true);
}
