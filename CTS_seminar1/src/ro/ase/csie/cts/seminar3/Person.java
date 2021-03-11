package ro.ase.csie.cts.seminar3;

import java.util.Date;

public class Person { //clasa utilizata sa nu punem toate atributele in BankAccount (SRP-cleanCode)
	
	private String name;
	
	private String address;
	
	private Date birthDate; //util importat
	
	private long salary;
	
	private String email;
	private String mobile;
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}

	private NotificationType notificationType;
	
	public static enum NotificationType{
		EMAIL,
		SMS
	}
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
