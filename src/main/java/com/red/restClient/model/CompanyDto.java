package com.red.restClient.model;

import org.springframework.lang.NonNull;

public class CompanyDto {
	private String registrationNumber;
	private String fullName;
	private String address;
	private String status;
	private String registrationDate;

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "CompanyDto{" +
				"registrationNumber='" + registrationNumber + '\'' +
				", fullName='" + fullName + '\'' +
				", address='" + address + '\'' +
				", status='" + status + '\'' +
				", registrationDate='" + registrationDate + '\'' +
				'}';
	}
}
