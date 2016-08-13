package com.shilm.annotation;

import java.lang.annotation.*;

/**
 * Created by rola on 16-8-13.
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "shilm";
    String date();
    int revision() default 1;
    String comments();
}
