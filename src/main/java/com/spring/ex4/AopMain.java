package com.spring.ex4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
	/*	
		StudentImpl student = new StudentImpl();
		student.setName("Á¶Á¤¼®");
		student.setAge(10);
		student.setGradeNum(3);
		student.setClassNum(5);
		
		student.getStudentInfo();
	*/	
		
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("aopExam.xml");
		
		
		Student mystudent = (Student)context.getBean("mystudent");
		mystudent.getStudentInfo();
		
		System.out.println("======================================");
		
		Worker myworker = (Worker) context.getBean("myworker");
		myworker.getWorkerInfo();
	}
}
