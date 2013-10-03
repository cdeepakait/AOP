/**
 * 
 */
package com.deepak.pojo;


/**
 * @author deepak
 * 
 */
public class Student {
	private int roll;
	private String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printName(String name) {
		System.out.println("Name is : " + this.name);
	}

	public void printRoll() {
		System.out.println("Roll is : " + this.roll);
	}

	public void throwExcetion() {
		throw new IllegalArgumentException("Checking the exception");
	}

	@Override
	public String toString() {
		return "name = " + this.name + " roll = " + this.roll;
	}
}
