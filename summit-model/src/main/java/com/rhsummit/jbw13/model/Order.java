package com.rhsummit.jbw13.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
