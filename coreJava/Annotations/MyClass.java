package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{
    int sequence() default 0;
}

public class MyClass {
    @Execute(sequence = 2)
    public void myMethod1(){

    }
    @Execute(sequence = 1)
    public void myMethod2(){

    }
    @Execute(sequence = 3)
    public void myMethod3(){

    }

    public static void main(String[] args){
        // Class<MyClass> mymeth = MyClass.class;
        // LEARN HOW TO USE ANNOTATION FIELDS IN MAIN FUNCTION ????

    }
}
