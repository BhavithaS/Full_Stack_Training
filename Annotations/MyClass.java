package Assignments.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{
    int Sequence() default 0;
}

public class MyClass {
    @Execute(Sequence = 2)
    public void myMethod1(){

    }
    @Execute(Sequence = 1)
    public void myMethod2(){

    }
    @Execute(Sequence = 3)
    public void myMethod3(){

    }
}
