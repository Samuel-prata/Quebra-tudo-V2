package br.com.vainaweb.backend.t3quebratudo;

import java.util.ArrayList;
import java.util.List;

public class User {
	String	username;
	String	password;
	double	balance = 0;
	List<Course> myCourses = new ArrayList<>();
	List<Course> myShoppingCart = new ArrayList<>();
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addFunds(double value) {
		balance += value;
		if (balance < 0) {
			balance = 0;
		}
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void addCourse(Course course) {
		myCourses.add(course);
	}
	
	public void addCourseToCart(Course course) {
		myShoppingCart.add(course);
	}
	
	public void showCourses() {
		for (Course course : myCourses) {
			System.out.println(course);
		}
	}
	
	public void showShoppingCart() {
		for (Course course : myShoppingCart) {
			System.out.println(course);
		}
	}
	
	public void clearCart() {
		myShoppingCart.clear();
	}
	
	public boolean verifyUser(String username) {
		return this.username.equals(username);
	}
	
	public boolean verifyPass(String password) {
		return this.password.equals(password);
	}
}
