package ProjectClass;

public class ProjectClass {

	// attributes (variable)
	private int projectNumber;
	private String projectName;
	private String buildingType;
	private String erfNumber;
	private String projAddress;
	private double totalAmountCharge;
	private double totalAmountPaid;
	private String projectDeadline;

	// persons object
	PersonsClass architec;
	PersonsClass contractor;
	PersonsClass customer;

	//Constructor	
	public ProjectClass (int projectNumber, String projectName, String buildingType, String erfNumber, String projAddress, 
			double totalAmountCharge, double totalAmountPaid, String projectDeadline, PersonsClass architec, PersonsClass contractor, PersonsClass customer) {
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.erfNumber = erfNumber;
		this.projAddress = projAddress;
		this.totalAmountCharge = totalAmountCharge;
		this.totalAmountPaid = totalAmountPaid;
		this.projectDeadline = projectDeadline;
		this.architec = architec;
		this.contractor = contractor;
		this.customer = customer;
	}
	// getters
	public int getProjectNumber() {
		return projectNumber;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getBuildingType() {
		return buildingType;
	}
	public String getErfNumber() {
		return erfNumber;
	}
	public String getProjAddress() {
		return projAddress;
	}
	public double getTotalAmountCharge() {
		return totalAmountCharge;
	}
	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}
	public String getProjectDeadline() {
		return projectDeadline;
	}
	public PersonsClass getContractor() {
		return contractor;
	}
	public PersonsClass getArchitec() {
		return architec;				
	}
	public PersonsClass getCustomer() {
		return customer;
	}
	// setters
	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;

	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	public void setErfNumber(String erfNumber) {
		this.erfNumber = erfNumber;
	}
	public void setProjAddress(String projAddress) {
		this.projAddress = projAddress;
	}
	public void setTotalAmountCharge(double totalAmountCharge) {
		this.totalAmountCharge = totalAmountCharge;	
	}
	public void setTotalAmountPaid(double totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}
	public void setProjectDeadline(String projectDeadline) {
		this.projectDeadline = projectDeadline;
	}
	public void setContractor(PersonsClass contractor) {
		this.contractor = contractor;
	}
	public void setArchitec(PersonsClass architect) {
		this.architec = architect;
	}
	public void setCustomer(PersonsClass customer ) {
		this.customer = customer;
	}



	public String toString() {
		String output ="Project Number: "+ projectNumber;
		output += "\nProject Name: "+ projectName;
		output += "\nBuilding Type: " + buildingType;
		output += "\nERfNumber:"+ erfNumber;
		output += "\nProject Address:"+ projAddress;
		output += "\nTotal Amount charge: " + totalAmountCharge;
		output += "\nTotal Amount Paid:"+ totalAmountPaid;
		output += "\nProject Deadline:"+ projectDeadline;
		output += "\nContractor: " +contractor;
		output += "\nArchitec: " +architec;
		output += "Customer:" +customer;
		return output;
	}
}

