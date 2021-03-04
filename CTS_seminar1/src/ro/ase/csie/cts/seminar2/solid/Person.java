package ro.ase.csie.cts.seminar2.solid;

import java.util.Date;

public class Person { //clasa utilizata sa nu punem toate atributele in BankAccount (SRP-cleanCode)
	
	private String name;
	
	private String address;
	
	private Date birthDate; //util importat
	
	private long salary;
	
	//constructor
	
	public Person(String name) {
		this.name=name;
	}
	
	//getteri si setteri

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}
