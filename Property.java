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
 This class contains all the information about a company's property.
 */
public class Property {
	private String propertyName, owner, city;
	private double rentAmount;
	/**
	 No-arg constructor
	 */
	public Property() {
		propertyName = "Property 1";
		city = "Cleveland";
		owner = "Alexander Hamilton";
		rentAmount = 900.0;
	}
	/**
	 This constructor initializes all the fields with the arguments passed. 
	 @param propertyName property name
	 @param city city
	 @param rentAmount rent amount
	 @param owner Owner of the property
	 */
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName= propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	/**
	 Copy constructor. 
	 @param anotherProperty The Property object to be copied.
	 */
	public Property(Property anotherProperty) {
		propertyName = anotherProperty.propertyName;
		owner = anotherProperty.owner;
		city = anotherProperty.city;
		rentAmount = anotherProperty.rentAmount;
	}
	/**
	 Returns the property's name. 
	 @return propertyName Property's name
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 Sets the property's name to the argument passed. 
	 @param propertyName property's name
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	/**
	 Returns the property's owner. 
	 @return owner Property's owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 Sets the property's owner to the argument passed. 
	 @param owner Owner of the property.
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 Returns the property's city. 
	 @return city Property's city
	 */
	public String getCity() {
		return city;
	}
	/**
	 Sets the property's city to the argument passed. 
	 @param city property's city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 Returns the property's rent amount. 
	 @return rentAmount Property's rent amount
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	/**
	 Sets the property's rentAmount to the argument passed. 
	 @param rentAmount property's rent amount
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount>0?rentAmount: 0;
	}
	/**
	 This method returns the String representation of the object.
	 @return info Information about the property.
	 */
	public String toString() {
		return propertyName + ", "+ city+", Rent: $" + String.format("%.2f", rentAmount) + ", Owner: " + owner;
	}
}
