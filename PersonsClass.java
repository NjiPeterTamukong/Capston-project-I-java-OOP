package ProjectClass;

public class PersonsClass {
	private String surName;
	private String name;
	private String emailAddress;
	private String physicalAddress;
	private String telephoneNumber;


	//constructor
	public PersonsClass (String surName, String name, String emailAddress, String physicalAddress, String telephoneNumber) {
		this.surName = surName;
		this.name = name;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
		this.telephoneNumber = telephoneNumber;
	}

	public String getsurName() {
		return name;
	}

	public String getname() {
		return name;	
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getphysicalAddress() {
		return physicalAddress;
	}
	public String getTelephonenNmber() {
		return telephoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public void setTelephonenNmber(String telephonenNmber) {
		this.telephoneNumber = telephonenNmber;
	}

	public String toString() {String output = "Surname:" +surName;
	output+= "\nName:" + name;
	output+= "\nEmail Address:" +emailAddress;
	output+= "\nPhysical Address:" +physicalAddress;
	output+= "\nTelephone Number:" +telephoneNumber;
	return output;
	}
}
