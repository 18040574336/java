package com.lp;

import org.junit.runner.RunWith;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
public @interface TestAnnotaion {
}
