package Thread;

import java.util.Date;

public class student {
 String id;
 String name;
 String address;
String dateOfBirth;
int sum;
boolean isDigit;
public student() {
	
}
public student(String id, String name, String address, String dateOfBirth) {
	
	this.id = id;
	this.name = name;
	this.address = address;
	this.dateOfBirth = dateOfBirth;
}
public String getId() {
	return id;
}
public void setId(String string) {
	this.id = string;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public String setDateOfBirth(String dateOfBirth) {
	return this.dateOfBirth = dateOfBirth;
}

public int getSum() {
	return sum;
}

public void setSum(int sum) {
	this.sum = sum;
}

public boolean isDigit() {
	return isDigit;
}

public void setDigit(boolean isDigit) {
	this.isDigit = isDigit;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", address=" + address + ", dateOfBirth=" + dateOfBirth + "]";
}

}
