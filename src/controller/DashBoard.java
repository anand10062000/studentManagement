package controller;

import model.Student;
import modeladdress.Address;
import service.IStudentService;
import serviecimpl.StudentServiceImpl;
import utility.UtilScanner;

public class DashBoard {
	public static void main(String[] args) {
		
		Student studentObject = new Student();
		Address addressObject = new Address();
		
		studentObject.setFirstName(UtilScanner.getString("enter ur first name"));
		studentObject.setMiddleName(UtilScanner.getString("enter ur middle name"));
		studentObject.setLastName(UtilScanner.getString("enter ur last name"));
		studentObject.setEmailId(UtilScanner.getString("enter ur emailid "));
		studentObject.setMobileNum(UtilScanner.getString("enter ur mobile num"));
		
	
		addressObject.setCity(UtilScanner.getString("enter ur city name"));
		addressObject.setLandMark(UtilScanner.getString("enter ur landmark"));
		addressObject.setStreetName(UtilScanner.getString("enter ur street name"));
		addressObject.setPin(UtilScanner.getInt("enter ur pin number"));
		
		studentObject.setAddress(addressObject);
		System.out.println(studentObject.toString());
		
		IStudentService studentService = new StudentServiceImpl();
		studentService.addStudent(studentObject);
		
		
	}

}
