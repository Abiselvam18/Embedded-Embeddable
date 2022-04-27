package com.edu;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_hibernate")
public class Employee {
@Id
private int Eid;
@Column(length=30)
private String Ename;
@Embedded
Address address;

public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	Eid = eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public Employee(int Eid, String Ename, Address address) {
	super();
	this.Eid=Eid;
	this.Ename=Ename;
	this.address=address;
}

public Employee() {
	super();
}

@Override
public String toString() {
	return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", address=" + address + "]";
}

}
