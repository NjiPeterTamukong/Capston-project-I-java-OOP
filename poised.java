package ProjectClass;
import java.util.*;
							//Poised Project Template for present and future projects
// declaring class poised. 
public class poised {
	// getting a person's information in the establishment and updating of a specific project via the keyboard.
	// getperInfor method of projectClass through the keyboard. 
	public static ProjectClass getProjectClass(){
		
		@SuppressWarnings("resource")
		Scanner projnumber = new Scanner(System.in); // scanning the user input
		System.out.println("Kindly enter the project number: "); // enter the input
		int projectNumber = projnumber.nextInt(); // storing the input as an int under the variable projectNumber

		@SuppressWarnings("resource")
		Scanner projName = new Scanner(System.in);
		System.out.println("Enter the project name : ");
		String projectName = projName.nextLine();

		@SuppressWarnings("resource")
		Scanner builtype = new Scanner(System.in);
		System.out.println("Enter the building type(design) for the project:\n"
				+ "House\n"
				+ "Apartment\n"
				+ "Store");
		String buildingType = builtype.nextLine();

		@SuppressWarnings("resource")
		Scanner address = new Scanner(System.in);
		System.out.println("Enter the project's physical address: ");
		String physicalAddress = address.nextLine();

		@SuppressWarnings("resource")
		Scanner erfNum = new Scanner(System.in);
		System.out.println("Enter the project's ERF number: ");
		String erfNumber = erfNum.nextLine();		  

		@SuppressWarnings("resource")
		Scanner totalfee = new Scanner(System.in);
		System.out.println("Kindly enter the total fee charged of the project: ");
		double totalFeeCharge = totalfee.nextDouble();

		@SuppressWarnings("resource")
		Scanner amount = new Scanner(System.in);
		System.out.println("Enter the total amount paid to date of the project: ");
		double totalAmountPaid = amount.nextDouble();		    

		@SuppressWarnings("resource")
		Scanner Deadline = new Scanner(System.in);
		System.out.println("Enter the Deadline of the project, kindly use this date format YYYY/MM/DD: ");
		String projectDateline = Deadline.nextLine();
		System.out.println("\n");

		//persons objects created
		//capturing of persons details here from the "public static PersonClass getPersoninfo" below 
		System.out.println("capturing the Contractor details.\n================================\n");
		PersonsClass contractor = getPersonInfo();
		System.out.println("\n");

		System.out.println("Capturing the Costomer details. \n==============================\n");
		PersonsClass customer = getPersonInfo();
		System.out.println("\n");

		System.out.println("Capturing the Architect details. \n==============================\n");
		PersonsClass architect = getPersonInfo(); 
		System.out.println("\n");

		// creating all the objects of the new Project (Project Class)
		return new ProjectClass(projectNumber, projectName, buildingType, physicalAddress, 
				erfNumber, totalFeeCharge, totalAmountPaid, projectDateline, contractor, customer, architect);

	}

	
	// getperInfor method of personsClass for persons; constructor, costumer and architect via the key board
	public static PersonsClass getPersonInfo(){
		@SuppressWarnings("resource")
		Scanner userSurname = new Scanner(System.in);
		System.out.println("Enter the surname of the preson: ");
		String SurName = userSurname.nextLine();

		@SuppressWarnings("resource")
		Scanner userName = new Scanner(System.in);
		System.out.println("Enter the name of the person: ");
		String Name = userName.nextLine();

		@SuppressWarnings("resource")
		Scanner contact = new Scanner(System.in);
		System.out.println("Enter the contact number of the person: ");
		String contactnumber = contact.nextLine();

		@SuppressWarnings("resource")
		Scanner email = new Scanner(System.in);
		System.out.println("Enter the email address of the person: ");
		String emailaddress = email.nextLine();

		@SuppressWarnings("resource")
		Scanner address = new Scanner(System.in);
		System.out.println("Enter the physical address of the person: ");
		String pysaddress = address.nextLine();

		// creating all the objects of persons
		return new PersonsClass(SurName, Name, contactnumber, emailaddress, pysaddress);

	} 
	// declaring main method
	public static void main(String[] args) {

		// A new variable called project is initialized to the value 'getProjectClass'
		ProjectClass project = getProjectClass();

		// printing out the project content
		System.out.println(project);

		// creating a menu for the project

		@SuppressWarnings({ "resource" })
		Scanner userInput = new Scanner(System.in);
		System.out.println("\n================ M E N U ================: \n"
				+ "\n Enter 1 to modify the Deadline of the project:"
				+ "\n Enter 2 to modify the total amount of fee paid:"
				+ "\n Enter 3 to change the detials of the contractor:"
				+ "\n Enter 4 to finalise the project: ");
		
		//initializing the update( new variable) to userinput.nextlnt() 
		int update = userInput.nextInt();

		// if update is equal to 1	
		if (update == 1) {

			// getting input from the user
			System.out.println("Enter new Deadline: ");

			// assigning a variable called date, in the scanner
			
			@SuppressWarnings("resource")
			Scanner date = new Scanner(System.in);

			// initializing date.netLine to newDeadline which cast to String
			String newDeadline = date.nextLine();

			// setting newDeadline to project
			project.setProjectDeadline(newDeadline);	

			// printing project
			System.out.println(project);

		}

		//else if update is equal to 2
		else if (update == 2) {

			// getting input from the user
			System.out.println("kindly enter the new amount of fee paid");

			// assigning a variable called fee
			@SuppressWarnings("resource")
			Scanner fee = new Scanner(System.in);

			// initializing fee.netDouble to newAmount which then cast to double
			double newAmount = fee.nextDouble();

			// setting newAmount to project
			project.setTotalAmountCharge(newAmount);

			// printing project
			System.out.println(project);
		}

		// if update is equal to 4
		else if (update == 4) {

			// getting the method TotalFeecharge and initialize to total fee
			double totalfee = project.getTotalAmountCharge();

			// getting the method TotalFeecharge and initialize to total amount
			double totalpaid = project.getTotalAmountCharge();

			// performing the difference of totalfee and totalpaid and initialize it to grandtotal 
			// which is cast to double
			double grandtotal = totalfee - totalpaid;

			// printing customer reciept
			System.out.println("costomer reciept. \n=================n");

			// printing the getcustomer method
			System.out.println(project.getCustomer());

			// print the sentence plus the get totalfeecharge method
			System.out.println("The total fee charge of the project is: "+ project.getTotalAmountCharge());

			// print the sentence plus the gettotalamount method
			System.out.println("The total amount being paid of the project is: "+ project.getTotalAmountCharge());

			// print the content of grandtotal.
			System.out.println("The total balance to be paid is: "+ grandtotal);

		}	

		//else if update is equal to 3
		else if (update == 3) {

			// getting the contractor details through the keyboard
			System.out.println("Please enter new contractor details");

			// creating a new scanner menu for the contractor
			@SuppressWarnings("resource")
			Scanner contInput = new Scanner(System.in);
			System.out.println("\n================= M E N U =================: \n"
					+ "\n Enter 1 to change the contractor contact number:"
					+ "\n Enter 2 to change the contractor email address:"
					+ "\n Enter 3 to change the contractor physical address:");

			// Initialize userinput.netInt() to syscont
			int sysCont = userInput.nextInt();

			// if syscont is equal to 1
			if (sysCont == 1) {

				// getting new contact from the contractor
				System.out.println("Please enter the contractor's new contact:");

				// assigning a variable called newcontact
				@SuppressWarnings({ "unused", "resource" })
				Scanner newContact = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and setcontractor 
				// number in bracket newContractordetails
				project.getContractor().setTelephonenNmber(newContractordetails);

				// printing the content of project
				System.out.print(project);

			}

			// else if syscont is equal to 2
			else if (sysCont == 2) {

				// getting contractor email address
				System.out.println("Enter new contractor's email address:");

				// assigning a variable called new email
				@SuppressWarnings({ "unused", "resource" })
				Scanner newEmail = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and  set contractor's 
				// email in bracket newContractordetails
				project.getContractor().setEmailAddress(newContractordetails);

				// printing the content of project
				System.out.print(project);

			}

			// else if syscont is equal to 3
			else if (sysCont == 3) {

				// getting contractor physical address
				System.out.println("Enter the contractors new physical address:");

				//  assigning a variable called new address
				@SuppressWarnings({ "unused", "resource" })
				Scanner newAddress = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and set contractor's 
				// physical address in bracket newContractordetails
				project.getContractor().setPhysicalAddress(newContractordetails);

				// printing the content of project
				System.out.println(project);
			}

		}

	}

}
