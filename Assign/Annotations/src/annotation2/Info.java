package annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@interface Info {
	String authorID() ;
    String author() default "";
    String superisor() default "";
    String date();
    String time();
    int version();
    String description() default "";
}
