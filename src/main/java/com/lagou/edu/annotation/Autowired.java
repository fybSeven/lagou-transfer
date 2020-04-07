package com.lagou.edu.annotation;

import java.lang.annotation.*;


@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Autowired {
    //名称
    String value() default "";
}