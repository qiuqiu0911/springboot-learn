package cn.qiuqiuweb.learn.ch1.aop;

import java.lang.annotation.*;

/**
 * 自定义的注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
