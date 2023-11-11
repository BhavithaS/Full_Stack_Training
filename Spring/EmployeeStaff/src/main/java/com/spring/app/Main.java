package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static Department loadStaffDetails(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Department department = (Department) context.getBean("departmentObj");
        return department;
    }
    public static void main(String[] args) {
        Department department = loadStaffDetails();
        department.displayStaffDetails();

//        int deptId = department.getDepartmentId();
//        List<Staff> staff = department.getStaffs();
//        System.out.println(department);

//        Staff staff = (Staff) context.getBean("staffObj");
//        System.out.println(staff);
    }
}