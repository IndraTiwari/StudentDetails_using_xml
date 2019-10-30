package com.itc.spring.student;

public class Student {
	private int studentId;
	private String name;
	private gender studentGender;
	private int age;
	
	public enum gender{M,F}
	public Student(int studentId, String name,gender studentGender, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.studentGender=studentGender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", Gender=" + studentGender + ", age=" + age + "]";
	}
	
	
	
}
