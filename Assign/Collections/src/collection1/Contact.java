package collection1;

public class Contact {
	long phoneNumber;
    String name;
    String email;
    Gender gender;
    
	public Contact(long phoneNumber, String name, String email, Gender gender) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ "]";
	}
	
    
    
}
