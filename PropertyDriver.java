import java.util.Scanner;
/*
 * Class: CMSC203 CRN 21410
 * Instructor: Huseyin Aygun
 * Description: (This program helps managing a company’s properties)
 * Due: 10/25/2026
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alexander Zlodorev
*/

/**
 This is a driver class for Property and ManagementCompany classes.
 It allows the user to choose from four options, and acts as the user requested.
 */
public class PropertyDriver {
	public static void main(String[] args) {
		//Declare objects used
		Scanner input = new Scanner(System.in);
		ManagementCompany managementCompany = new ManagementCompany("Montgomery College", "989-989-9090");
		Property property = new Property();
		//Declare the Strings to hold the menu and header as well as the variables used in the following do-while loop. Then print the header.
		int choice = 3, indexOfPropertyAdded;
		double monthlyRent;
		String propertyName, city, ownerName;
		String header = "=========================================\n       Assignment 4: Property Manager\n==========================================\n";
		String menu = "1-Add Property\n2-Display All Properties\n3-Show Total Rent\n4-Exit";
		System.out.print(header);
		do {
			//Print the menu, ask the choice, and validate it.
			System.out.print(menu+"\n\nEnter choice (1-4): ");
			choice = input.nextInt();
			
			while(choice <=0 || choice >=5) {
				System.out.print("Please re-enter: ");
				choice = input.nextInt();
			}
			//Read the remaining "\n" character
			input.nextLine();
			//Determine which of the four valid choices was chosen. If 4 was inputed, then the switch statement simply skips it and the loop ends.
			switch(choice) {
			case 1: //Add property choice. Lines 27-40 absorb and validate the information about a property
				System.out.print("Enter property name: ");
				propertyName = input.nextLine();
				System.out.print("Enter city: ");
				city = input.nextLine();
				System.out.print("Enter monthly rent: ");
				monthlyRent = input.nextDouble();
				input.nextLine();
				while(monthlyRent <=0) {
					System.out.print("Negative values and zero are not accepted. Please re-enter: ");
					monthlyRent = input.nextDouble();
					input.nextLine();
				}
				System.out.print("Enter owner name: ");
				ownerName = input.nextLine();
				property.setPropertyName(propertyName);
				property.setCity(city);
				property.setOwner(ownerName);
				property.setRentAmount(monthlyRent);
				//The following line attemps to add the property. The index (or error code) returned is assigned to indexOfPropertyAdded variable.
				indexOfPropertyAdded = managementCompany.addProperty(property);
				//If the error code was returned, print the error message. Otherwise, print "Property added at index: " and index.
				if(indexOfPropertyAdded == -1) {
					System.out.println("Property can't be added as the property list is already full.");
				}
				else {
					System.out.println("Property added at index: " + indexOfPropertyAdded + ".");
				}
				break;
			case 2:
				//Display information. The following print statement calls manageCompany's toString() 
				//and displays the information about the company and it's properties
				System.out.print(managementCompany);
				break;
			case 3://Show total rent.
				System.out.println("Total rent: $" + managementCompany.totalRent());
				break;
			}
			//Just a new line so that the output would be more readable.
			System.out.println();
		} while(choice !=4);
		//End of the program.
		System.out.print("Thank you! Bye!\nProgrammer: Alexander Zlodorev");
		input.close();
		System.exit(0);
	}

}
