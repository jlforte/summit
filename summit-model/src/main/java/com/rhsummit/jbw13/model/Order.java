package com.rhsummit.jbw13.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7359067638567173788L;
	private Long id;
	private String promoCode = null;
	private BigDecimal initialPrice = null;
	private BigDecimal adjustedPrice = null;
	private String shipping = "Base Shipping";
	private BigDecimal shippingPrice = new BigDecimal(10);
	private Boolean expeditedShipping = false;
	private Boolean overweightShipping = false;
	private Boolean discountedForItems = false;
	private Customer customer;
	private Boolean approved = false;
	private List<LineItem> lineItems;

	
	public Order(){
		
	}
	
	public Order(Long id, String promoCode, BigDecimal initialPrice,
			BigDecimal adjustedPrice, String shipping,
			BigDecimal shippingPrice, Boolean expeditedShipping,
			Boolean overweightShipping, Boolean discountedForItems,
			Customer customer, Boolean approved, List<LineItem> lineItems) {
		super();
		this.id = id;
		this.promoCode = promoCode;
		this.initialPrice = initialPrice;
		this.adjustedPrice = adjustedPrice;
		this.shipping = shipping;
		this.shippingPrice = shippingPrice;
		this.expeditedShipping = expeditedShipping;
		this.overweightShipping = overweightShipping;
		this.discountedForItems = discountedForItems;
		this.customer = customer;
		this.approved = approved;
		this.lineItems = lineItems;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public BigDecimal getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}

	public BigDecimal getAdjustedPrice() {
		return adjustedPrice;
	}

	public void setAdjustedPrice(BigDecimal adjustedPrice) {
		this.adjustedPrice = adjustedPrice;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public BigDecimal getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(BigDecimal shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public Boolean getExpeditedShipping() {
		return expeditedShipping;
	}

	public void setExpeditedShipping(Boolean expeditedShipping) {
		this.expeditedShipping = expeditedShipping;
	}

	public Boolean getOverweightShipping() {
		return overweightShipping;
	}

	public void setOverweightShipping(Boolean overweightShipping) {
		this.overweightShipping = overweightShipping;
	}

	public Boolean getDiscountedForItems() {
		return discountedForItems;
	}

	public void setDiscountedForItems(Boolean discountedForItems) {
		this.discountedForItems = discountedForItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((adjustedPrice == null) ? 0 : adjustedPrice.hashCode());
		result = prime * result
				+ ((approved == null) ? 0 : approved.hashCode());
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime
				* result
				+ ((discountedForItems == null) ? 0 : discountedForItems
						.hashCode());
		result = prime
				* result
				+ ((expeditedShipping == null) ? 0 : expeditedShipping
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((initialPrice == null) ? 0 : initialPrice.hashCode());
		result = prime * result
				+ ((lineItems == null) ? 0 : lineItems.hashCode());
		result = prime
				* result
				+ ((overweightShipping == null) ? 0 : overweightShipping
						.hashCode());
		result = prime * result
				+ ((promoCode == null) ? 0 : promoCode.hashCode());
		result = prime * result
				+ ((shipping == null) ? 0 : shipping.hashCode());
		result = prime * result
				+ ((shippingPrice == null) ? 0 : shippingPrice.hashCode());
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
		Order other = (Order) obj;
		if (adjustedPrice == null) {
			if (other.adjustedPrice != null)
				return false;
		} else if (!adjustedPrice.equals(other.adjustedPrice))
			return false;
		if (approved == null) {
			if (other.approved != null)
				return false;
		} else if (!approved.equals(other.approved))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (discountedForItems == null) {
			if (other.discountedForItems != null)
				return false;
		} else if (!discountedForItems.equals(other.discountedForItems))
			return false;
		if (expeditedShipping == null) {
			if (other.expeditedShipping != null)
				return false;
		} else if (!expeditedShipping.equals(other.expeditedShipping))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (initialPrice == null) {
			if (other.initialPrice != null)
				return false;
		} else if (!initialPrice.equals(other.initialPrice))
			return false;
		if (lineItems == null) {
			if (other.lineItems != null)
				return false;
		} else if (!lineItems.equals(other.lineItems))
			return false;
		if (overweightShipping == null) {
			if (other.overweightShipping != null)
				return false;
		} else if (!overweightShipping.equals(other.overweightShipping))
			return false;
		if (promoCode == null) {
			if (other.promoCode != null)
				return false;
		} else if (!promoCode.equals(other.promoCode))
			return false;
		if (shipping == null) {
			if (other.shipping != null)
				return false;
		} else if (!shipping.equals(other.shipping))
			return false;
		if (shippingPrice == null) {
			if (other.shippingPrice != null)
				return false;
		} else if (!shippingPrice.equals(other.shippingPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", promoCode=" + promoCode
				+ ", initialPrice=" + initialPrice + ", adjustedPrice="
				+ adjustedPrice + ", shipping=" + shipping + ", shippingPrice="
				+ shippingPrice + ", expeditedShipping=" + expeditedShipping
				+ ", overweightShipping=" + overweightShipping
				+ ", discountedForItems=" + discountedForItems + ", customer="
				+ customer + ", approved=" + approved + ", lineItems="
				+ lineItems + "]";
	}






}

