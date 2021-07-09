package com.kuntest.core.api;

import static java.lang.annotation.ElementType.METHOD;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xf
 * @version 1.0
 * @date 2021/x/xx
 */

@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Test {
}
