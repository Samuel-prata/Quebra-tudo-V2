package br.com.vainaweb.backend.t3quebratudo;

public class Course {
	int		hours;
	String	name;
	String	desc;
	double	price;
	
	public Course(String name, String desc, double price, int hours) {
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.hours = hours;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return name + "\n" + desc + "\nPreço: R$" + String.format("%.2f", price) + "\nCarga horária: "  + hours + " horas\n";
	}

}
