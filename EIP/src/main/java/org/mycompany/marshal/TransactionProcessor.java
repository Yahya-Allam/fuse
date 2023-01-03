package org.mycompany.marshal;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
@Component
public class TransactionProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		TransactionDto transactionDto = exchange.getMessage().getBody(TransactionDto.class);
		transactionDto.setTransactionDate(new Date().toString());
  		exchange.getOut().setBody(transactionDto);
 		
		
 		
	}

}
