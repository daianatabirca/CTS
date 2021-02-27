package s1_test;

public class Persoana {
	
	private String firstname;
	private String lastname;
	
	
	public Persoana(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Persoana [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	

	
}
