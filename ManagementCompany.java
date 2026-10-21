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
 This is a class that stores information about Management Company.
 */
public class ManagementCompany {
	public static final int MAX_PROPERTIES = 3;
	private String name, taxId;
	private Property[] properties = new Property[MAX_PROPERTIES];
	private static int propertyCount=0;
	/**
	 No-arg constructor
	 */
	public ManagementCompany() {
		this("White Wash Company, Inc.","345-345-6767");
		propertyCount =0;
	}
	/**
	 Constructor initializes name and taxId with the passed arguments. 
	 @param name Name of the company
	 @param taxId Tax ID of the company
	 */
	public ManagementCompany(String name, String taxId){
		this.name = name;
		this.taxId = taxId;
		propertyCount =0;
	}
	/**
	 Copy constructor
	 @param mgP The ManagementCompany object to be copied.
	 */
	public ManagementCompany(ManagementCompany mgP) {
		name = mgP.name;
		taxId = mgP.taxId;
		for(int index =0; index<properties.length&&mgP.properties[index] != null; index++) {
			properties[index] = new Property(mgP.properties[index]);
		}
		propertyCount =1;
	}
	/**
	 This method adds a property to Property[] properties using Property class's copy constructor. 
	 If the array is full, the method returns an error code.
	 @param p The Property object to be added
	 @return propertyCount-1 The index of the added property.
	 */
	public int addProperty(Property p) {
		
		if(propertyCount == properties.length) {
			return -1;
		}

		properties[propertyCount] = new Property(p);
		propertyCount++;
		return (propertyCount-1);
	}
	/**
	  This method calculates and returns the totalRent of properties inside properties array.
	 @return totalRent Sum of each property's rent amount.
	 */
	public double totalRent() {
		double totalRent =0;
		for(int index =0; index< properties.length&&properties[index]!=null; index++) {
			totalRent += properties[index].getRentAmount();
		}
		return totalRent;
	}
	
	/**
	 This methods formats and returns the information about the company and its' properties.
	 @return info All the information about the company and its' properties.
	 */
	public String toString() {
		String info = "Management company: " + name  + " (Tax ID:" + taxId+")\nProperties:\n";
		if(properties[0] == null) {
			info += " No properties owned\n";
		}
		for(int index=0; index<properties.length&&properties[index] !=null; index++) {
			info += " "+ index + ": " + properties[index]+"\n";
		}
		info +="Total rent: $" + String.format("%.2f",totalRent())+"\n";
		return info;
	}
	/**
	Returns the property count. 
	 @return propertyCount The field counting the number of properties.
	 */
	public int getPropertyCount() {
		return propertyCount;
	}
	/**
	 This method returns the name of the company. 
	 @return name Name of the company
	 */
	public String getName() {
		return name;
	}
	/**
	 This method returns the tax ID of the company. 
	 @return taxId Tax ID of the company
	 */
	public String getTaxId() {
		return taxId;
	}
}