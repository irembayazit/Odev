package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
	private int id;
	private String nationalId;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private double money;
	
	public Customer() {
		
	}
	
	public Customer(int id, String nationalId, String firstName, String lastName, int dateOfBirth,double money) {
		super();
		this.id = id;
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
