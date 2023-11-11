package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static Department loadStaffDetails()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Department department = (Department) context.getBean("departmentObj");
        return department;
		return null;
	}

	public static void main(String[] args) {
		//fill the code
		Department department = loadStaffDetails();
        department.displayStaffDetails();

	}

}
