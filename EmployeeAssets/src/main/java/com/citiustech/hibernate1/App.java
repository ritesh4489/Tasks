package com.citiustech.hibernate1;

import java.util.List;
import java.util.Scanner;

import com.citiustech.hibernate1.dao.EmployeeDao;
import com.citiustech.hibernate1.model.Assets;
import com.citiustech.hibernate1.model.Employee;


public class App {
	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDao();

		Scanner scanner = new Scanner(System.in);
//    	Add Movie

//		System.out.println("Enter Employee Name");
//		String ename = scanner.next();
//		System.out.println("Enter Employee password");
//		String pass = scanner.next();
//
//		System.out.println("Enter Employee serial Number");
//		int serialNo = scanner.nextInt();
//		System.out.println("Enter Employee pr Number");
//		int prNo = scanner.nextInt();
//		System.out.println("Enter Employee assetType");
//		String assetType = scanner.next();
//		System.out.println("Enter Employee assetprice");
//		int assetprice = scanner.nextInt();
//		System.out.println("Enter Employee assetLocation");
//		String assetLocation = scanner.next();
//
//		Assets assets = new Assets();
//		assets.setSerialNo(serialNo);
//		assets.setPrNo(prNo);
//		assets.setAssetType(assetType);
//		assets.setAssetprice(assetprice);
//		assets.setAssetLocation(assetLocation);
//
//		Employee employee = new Employee();
//		employee.setEmpName(ename);
//		employee.setPassword(pass);
//		employee.setAsset(assets);
//
//		employeeDao.create(employee);

//      Update Employee - password
//		System.out.println("Enter Employee ID");
//		int empid = scanner.nextInt();
//		System.out.println("Enter Employee New Password");
//		String newpass = scanner.next();
//		employeeDao.update(empid,newpass);

//      Delete Employee
//		System.out.println("Enter Employee ID");
//		int empid = scanner.nextInt();
//        employeeDao.delete(empid);
        
//      Get all Employee
        List<Employee> emplist=employeeDao.read();
        for(Employee e : emplist)
        System.out.println(e);
	}
}
