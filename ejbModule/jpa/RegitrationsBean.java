package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegitrationsBean implements java.io.Serializable {

	private String userName,password,email,name,state,city,country,zipCode,phone,gender;
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	private static final long serialVersionUID = 1L;
	@Id
	int registrationId;
	public int getRegistrationId() {
		return registrationId;
	}



	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getZipCode() {
	return zipCode;
}

public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}
}