package com.springProject.SpringPracticeFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//Fatching property from Bean.xml file.
		ApplicationContext context = new FileSystemXmlApplicationContext("Bean.xml");

		Patient patientobj = (Patient) context.getBean("patient");
		//ListItemを入力です。
		for(String name:patientobj.getEmergencyContactNames())
		{
			System.out.println(name);
		}

		System.out.println(patientobj);
		((FileSystemXmlApplicationContext) context).close();

		// System.out.println( "Hello World!" );
	}
}
