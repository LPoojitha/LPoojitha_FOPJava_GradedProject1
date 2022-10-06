package com.greatlearning.dept.driver;

import com.greatlearning.dept.service.AdminDepartment;
import com.greatlearning.dept.service.HRDepartment;
import com.greatlearning.dept.service.TechDepartment;

public class ITAdminApplication {

	public static void main(String[] args) {

		final String WELCOME = " Welcome to";

		AdminDepartment admin = new AdminDepartment();
		System.out.println(WELCOME + admin.departmentName() + "\n" + admin.getTodaysWork() + "\n"
				+ admin.getWorkDeadline() + "\n" + admin.isTodayAHoliday() + "\n");
		HRDepartment hr = new HRDepartment();
		System.out.println(WELCOME + hr.departmentName() + "\n" + hr.doActivity()+"\n"+hr.getTodaysWork() + "\n" + hr.getWorkDeadline()
				+ "\n" + hr.isTodayAHoliday() + "\n");
		TechDepartment tech = new TechDepartment();
		System.out.println(WELCOME + tech.departmentName() + "\n" + tech.getTodaysWork() + "\n" + tech.getWorkDeadline()
				+ "\n" + tech.getTechStackInformation() + "\n" + tech.isTodayAHoliday() + "\n");
	}
}
