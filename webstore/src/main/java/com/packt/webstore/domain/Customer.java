package com.packt.webstore.domain;

public class Customer {

	private String customerId;
	private String name;
	private String address;
	private String noOfOrdersMade;

	public Customer() {
		super();
	}

	public Customer(String customerId, String name, String address, String noOfOrdersMade) {
		this.setCustomerId(customerId);
		this.setName(name);
		this.setAddress(address);
		this.setNoOfOrdersMade(noOfOrdersMade);
	}
	// add setters and getters for all the fields here
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (getCustomerId() == null) {
			if (other.getCustomerId() != null)
				return false;
		} else if (!getCustomerId().equals(other.getCustomerId()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + getCustomerId() + ", name=" + getName() + "]";
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public String getNoOfOrdersMade() {
		return noOfOrdersMade;
	}

	public void setNoOfOrdersMade(String noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

}
