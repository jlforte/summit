package com.rhsummit.jbw13.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1105582129420018188L;
	private String name;
	private Integer memberId;
	private Boolean paidCustomer = false;
	private String state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Boolean getPaidCustomer() {
		return paidCustomer;
	}

	public void setPaidCustomer(Boolean paidCustomer) {
		this.paidCustomer = paidCustomer;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((paidCustomer == null) ? 0 : paidCustomer.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (paidCustomer == null) {
			if (other.paidCustomer != null)
				return false;
		} else if (!paidCustomer.equals(other.paidCustomer))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", memberId=" + memberId
				+ ", paidCustomer=" + paidCustomer + ", state=" + state + "]";
	}

	public Customer(String name, Integer memberId, Boolean paidCustomer,
			String state) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.paidCustomer = paidCustomer;
		this.state = state;
	}

}
