package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Model{
    int seats() default 5;
    String modelName() default "i20";
}

@Model(seats = 7, modelName = "XUV")
class Car{
    String name;
    int speed;

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public void display(){
        System.out.println(" : " + name + " and speed : "+speed);
    }
}


public class ex {
    public static void main(String[] args){
        // Car car = new Car("Creta", 120);
        // car.display();
        // Class myCar = car.getClass();

        // Annotation testCar = myCar.getAnnotation(Model.class);
        // Model model = (Model)testCar;

        // System.out.println("Seats are :" + model.seats());
        // System.out.println("modelName is :" + model.modelName());
    }
}
