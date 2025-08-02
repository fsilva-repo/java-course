package JavaPoo;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


class Person {
	
	DateTimeFormatter tzFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
	
	private String name = "Jhon";
	private int age = 53;
	private LocalDate date = LocalDate.now();
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDate() {
		return date.format(tzFormatter);
	}
	
	public Person() {}
	public Person(String name, int age, int yyyy, int MM, int dd) {
		this.date = LocalDate.of(yyyy, MM, dd);
	}
	
}

public class DefaultValue {
	public static void main(String[] args) {
		
		/* Utilizando o construtor default */
		Person defaultPerson = new Person();
		/* utilizando oconstrutor personalizado */
		Person marcos = new Person("Marcos", 28, 1984, 05, 18);
		
		System.out.println(defaultPerson.getDate());
		System.out.println(marcos.getDate());
	}
}















