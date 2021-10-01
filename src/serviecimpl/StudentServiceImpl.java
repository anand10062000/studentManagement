package serviecimpl;


import java.util.regex.Pattern;

import model.Student;
import service.IStudentService;
import utility.UtilValidation;

public class StudentServiceImpl implements IStudentService{
	@Override
	public void addStudent(Student studentdata) {
		if(UtilValidation.startWithCapital(studentdata.getFirstName()) && UtilValidation.phoneNum(studentdata.getMobileNum())
				&& UtilValidation.emailIdValidation(studentdata.getEmailId())) {
			System.out.println("valid input");
		}else {
			System.out.println("error");
			
		}
	}

}
