package com.spring.app;

import java.util.List;

public class Department {
	
	private int departmentId;
	private List<Staff> staffs;
	
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public List<Staff> getStaffs() {
		return staffs;
	}
	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}
	
	/* Write a two argument constructor which accepts departmentId and list of 
	                                                  staffs as the parameters */
	public Department(int departmentId,List<Staff> staffs) {
		this.departmentId = departmentId;
		this.staffs = staffs;
	}
	
	public void displayStaffDetails() {
		System.out.println("Staff Details:");
        System.out.println("StaffId:"+staffs.getFirst().getStaffId());
        System.out.println("Staff Name:"+staffs.getFirst().getStaffName());
        System.out.println("Contact Number:"+staffs.getFirst().getContactNo());
        System.out.println("Department Name:"+staffs.getFirst().getDepartmentName());
        System.out.println("Department Id:"+departmentId);
		
	}

}
