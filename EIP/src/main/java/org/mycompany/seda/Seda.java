package org.mycompany.seda;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Seda extends RouteBuilder{

	@Autowired
	SedaProcessor sedaProcessor;
	@Override
	public void configure() throws Exception {
		from("timer:ping?period=200")
		.bean(sedaProcessor)
		.to("seda:complexSedaWay?multipleConsumers=true");
//		.to("direct:complexStage");
		
		from("seda:complexSedaWay?multipleConsumers=true")
		.to("direct:complexStage");

		
		
		from("direct:complexStage")
		.delay(200)
		.log("${body}")
		.end();
 		
	}

}
