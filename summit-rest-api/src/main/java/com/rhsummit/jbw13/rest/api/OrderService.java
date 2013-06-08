package com.rhsummit.jbw13.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rhsummit.jbw13.model.Order;

@Path("order")
public interface OrderService {
	
	@GET
	@Path("test")
	@Produces(MediaType.APPLICATION_JSON)
	public Order test();
	
}
