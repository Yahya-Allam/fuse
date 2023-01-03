package org.mycompany.seda;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class SedaProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getOut().setBody("The Date of This Day is :: "+new Date());
 		
	}

}
