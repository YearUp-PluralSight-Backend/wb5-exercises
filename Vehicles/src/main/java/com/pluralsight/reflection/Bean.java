package com.pluralsight.reflection;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bean {

    String name() default  "";

    Scope scope() default Scope.SINGLETON;

    enum Scope {
        SINGLETON,
        PROTOTYPE
    }

}