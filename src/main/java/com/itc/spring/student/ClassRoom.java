package com.itc.spring.student;

public class ClassRoom {
	private Student student;
	
public ClassRoom(Student student) {
	this.student=student;
}
public void displayDetails() {
	System.out.println(student);
}
}
