package com.rhsummit.jbw13.errai.client.local;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.bus.client.api.ErrorCallback;
import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.RemoteCallback;
import org.jboss.errai.enterprise.client.jaxrs.api.ResponseException;
import org.jboss.errai.ioc.client.api.Caller;
import org.jboss.errai.ioc.client.api.EntryPoint;

import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.rhsummit.jbw13.model.Order;
import com.rhsummit.jbw13.rest.api.OrderService;

/**
 * 
 * @author Andrew Block
 *
 */
@EntryPoint
public class BrmsErrai {
	
	
	@Inject
	Caller<OrderService> orderService;
	
	@PostConstruct
	public void init()
	{

		orderService.call(new RemoteCallback<Order>() {

			@Override
			public void callback(Order response) {
				Window.alert("Success: Id: "+response.getId());
				
			}
		}, new ErrorCallback() {
			
			@Override
			public boolean error(Message message, Throwable throwable) {
				try {
				      throw throwable;
				    }
				    catch (ResponseException e) {
				      Response response = e.getResponse();
				      // process unexpected response
				      response.getStatusCode();
				      Window.alert("Error: "+e.getMessage());
				    }
				    catch (Throwable t) {
				      Window.alert("Error: "+t.getMessage());
				    }
				    return false;
				  }
			}).test();
	}
	


}
