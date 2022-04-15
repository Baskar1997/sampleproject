package com.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class staffsEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
	private String noOFStaff;
	private boolean gender;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoOFStaff() {
		return noOFStaff;
	}
	public void setNoOFStaff(String noOFStaff) {
		this.noOFStaff = noOFStaff;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
	

