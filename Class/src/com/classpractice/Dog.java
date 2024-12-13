package com.classpractice;
//class is a collection of variables,methods,interfaces means it is a blueprint in which entire information is binded 
public class Dog {
String Breed = "pomerain";// variables declaration
int height=30;
int weight = 3;
	public static void main(String[] args) { // method
		Dog peter= new Dog();//object creation
		System.out.println(peter.Breed); //accessing of variables
		System.out.println(peter.height);
		System.out.println(peter.weight);
	}
}
