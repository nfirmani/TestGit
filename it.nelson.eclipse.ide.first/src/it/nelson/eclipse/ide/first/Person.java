package it.nelson.eclipse.ide.first;

public class Person {	
	private String FirstName;
	private String SecondName;
	public Person(String firstName, String secondName) {
		super();
		FirstName = firstName;
		SecondName = secondName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", SecondName=" + SecondName
				+ "]";
	}
	

}
