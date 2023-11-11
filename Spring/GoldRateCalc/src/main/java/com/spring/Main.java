package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static GoldRateInfo loadGoldRateDetails(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GoldRateInfo rates = (GoldRateInfo) context.getBean("rateInfoObj");
        return rates;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Carat:");
        int carat = sc.nextInt();
        System.out.println("Enter Total Grams:");
        double grams = sc.nextDouble();

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GoldRateInfo rates = loadGoldRateDetails();


        double price = rates.calculateGoldRate(carat,grams);
        System.out.println("Total Gold Rate is Rs:"+price);
    }
}