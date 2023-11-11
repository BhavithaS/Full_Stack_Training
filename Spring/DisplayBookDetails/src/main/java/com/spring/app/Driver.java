package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Driver {
    public static Order loadBookDetails(){
        ApplicationContext config = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Book book = config.getBean(Book.class);
        Order order =config.getBean(Order.class);
        return order;
    }

    public static void main(String[] args) {

        Order order = loadBookDetails();
        order.displayOrderDetails();
    }
}
