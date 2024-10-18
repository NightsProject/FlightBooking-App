/**
* @file 						DriverProgram(.java)
* @description 					Provide a description of the program/interface/class
* @course CCC102 				Summer Class
* @lab 							Activity 11.1
* @date 						07/11/2024
* @author 						MAGHUYOP, Bobeth
*/


public class Person {

	private String firstName;
	private String lastName;
	private String middleName;
	private String address;
	private String contactNumber;
	private String gender;
	
	public Person(){}
	public Person(String firstName, String lastName, String middleName, String address, String contactNumber, String gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.gender = gender;
	}
		
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getMiddleName(){
		return middleName;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getContactNumber(){
		return contactNumber;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	} 
}