package org.mycompany.restapi;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
//@Component
public class RouttingRestWithActiveMq extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:active-mq-timer?period=10000")
		.transform().constant("My ActiveMQ Message")
		.to("activemq:my-activemq-q");
		
	}

}
