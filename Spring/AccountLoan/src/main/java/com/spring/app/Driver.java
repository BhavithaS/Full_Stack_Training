package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static Account loadAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account acc = (Account)context.getBean("accountObj");
        return acc;
    }
    public static void main(String[] args) {
        Account account = loadAccount();
        System.out.println("Account Number:"+account.getAccNumber());
        System.out.println("Account holder name:"+account.getAccHolderName());
        System.out.println("Balance:"+account.getAccBalance());
//        System.out.println("Loan Type:"+account.getLoanInfo().getLoanType());
//        System.out.println("Loan amount:"+account.getLoanInfo().getLoanAmount());
    }
}
