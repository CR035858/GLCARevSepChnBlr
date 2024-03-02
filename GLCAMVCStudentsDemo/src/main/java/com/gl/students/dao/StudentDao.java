package com.gl.students.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.students.model.Student;

@Repository
public class StudentDao {
	
	List <Student> students;
	
	public StudentDao()
	{
		students = new ArrayList();
		
		int[] sco1 = {78,89,67,78,90};
		int[] sco2 = {88,79,77,78,89};
		int[] sco3 = {68,69,67,68,75};
		int[] sco4 = {78,89,75,76,82};
		int[] sco5 = {78,89,67,78,90};
		
		students.add(new Student("S001","Harsha","RTNagar",sco1));
		students.add(new Student("S002","Kiran","Koramangala",sco2));
		students.add(new Student("S003","Mohan","Malleswaram",sco3));
		students.add(new Student("S004","Mahesh","KRPuram",sco4));
		students.add(new Student("S005","Suresh","RTNagar",sco5));
	}
	
	public List <Student> getStudentsDao()
	{
		return students;
	}

}
