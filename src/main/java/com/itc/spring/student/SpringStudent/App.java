package com.itc.spring.student.SpringStudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itc.spring.student.ClassRoom;

public class App {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

			ClassRoom cr = (ClassRoom) context.getBean("classroom");
			ClassRoom cr1 = (ClassRoom) context.getBean("classroom1");
			cr.displayDetails();
			cr1.displayDetails();

		} catch (Exception ee) {
			System.out.println("Beans.xml was not found");
			System.out.println(ee.getMessage());

		}
	}
}
