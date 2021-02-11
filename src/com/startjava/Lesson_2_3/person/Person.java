package com.startjava.Lesson_2_3.person;

public class Person {
	String gender = "Мужской";
	String name = "Bob";
	double height = 1.80d;
	int weight = 95;
	int age = 25;

	void go() {
		System.out.println("Команда идти");
	}

	void sir() {
		System.out.println("Команда сидеть");
	}

	void run() {
		System.out.println("Команда бег");
	}

	void talk() {
		System.out.println("Команда говорить");
	}

	void teachJava() {
		System.out.println("Команда учить java"); 
    }
}