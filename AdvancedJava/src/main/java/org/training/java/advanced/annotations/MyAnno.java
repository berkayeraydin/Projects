package org.training.java.advanced.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
@Documented
public @interface MyAnno {
    String info();
    int count();
    long duration() default 10_000L;
}
