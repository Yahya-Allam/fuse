package org.mycompany.routing;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Routting extends RouteBuilder {

	@Autowired
	MessageExchange messageExchange;
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
//		from("timer:ping?period=200")
//		.bean(messageExchange)
//		.to("direct:complexStage");
//		
//		
//		from("direct:complexStage")
//		.delay(2000)
//		.log("${body}")
//		.end();
	}

}
