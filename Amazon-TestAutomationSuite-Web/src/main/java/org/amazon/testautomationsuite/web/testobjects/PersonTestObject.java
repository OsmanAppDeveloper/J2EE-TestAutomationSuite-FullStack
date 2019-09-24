
package org.amazon.testautomationsuite.web.testobjects;

public class PersonTestObject{
String firstName;
String middelName;
String lastName;
String fullName;
String age;
String sex;

public String getFirstName() {
	return firstName;
}
public String getMiddelName() {
	return middelName;
}
public String getLastName() {
	return lastName;
}
public String getFullName() {
	return fullName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setMiddelName(String middelName) {
	this.middelName = middelName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getAge() {
	return age;
}
public String getSex() {
	return sex;
}
public void setAge(String age) {
	this.age = age;
}
public void setSex(String sex) {
	this.sex = sex;
}
}