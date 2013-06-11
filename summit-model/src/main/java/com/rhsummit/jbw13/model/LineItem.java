package com.rhsummit.jbw13.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LineItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6756029712162888652L;
	
	private Boolean overweight;
	private String type;
	private Order order;
	private Integer quantity;
	private BigDecimal unitPrice;
	private BigDecimal totalPrice = null;
	private Boolean discounted = false;

	public Boolean getOverweight() {
		return overweight;
	}

	public void setOverweight(Boolean overweight) {
		this.overweight = overweight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Boolean getDiscounted() {
		return discounted;
	}

	public void setDiscounted(Boolean discounted) {
		this.discounted = discounted;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((discounted == null) ? 0 : discounted.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result
				+ ((overweight == null) ? 0 : overweight.hashCode());
		result = prime * result
				+ ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result
				+ ((totalPrice == null) ? 0 : totalPrice.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((unitPrice == null) ? 0 : unitPrice.hashCode());
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
		LineItem other = (LineItem) obj;
		if (discounted == null) {
			if (other.discounted != null)
				return false;
		} else if (!discounted.equals(other.discounted))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (overweight == null) {
			if (other.overweight != null)
				return false;
		} else if (!overweight.equals(other.overweight))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (totalPrice == null) {
			if (other.totalPrice != null)
				return false;
		} else if (!totalPrice.equals(other.totalPrice))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (unitPrice == null) {
			if (other.unitPrice != null)
				return false;
		} else if (!unitPrice.equals(other.unitPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LineItem [overweight=" + overweight + ", type=" + type
				+ ", order=" + order + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice
				+ ", discounted=" + discounted + "]";
	}

	public LineItem(Boolean overweight, String type, Order order,
			Integer quantity, BigDecimal unitPrice, BigDecimal totalPrice,
			Boolean discounted) {
		super();
		this.overweight = overweight;
		this.type = type;
		this.order = order;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.discounted = discounted;
	}

}
