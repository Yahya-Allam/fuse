package org.mycompany.marshal;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class TransactionRoute extends RouteBuilder{
	
	@Autowired
	TransactionProcessor transactionProcessor;
	public static final String SENDER="sender";
	public static final String RECEIVER="receiver";
	public static final String AUDIT_TRANSACTION_ROUTE="direct:audit-transaction";
	public static final String AUDIT="audit-transactions";
	public static final String RABBIT_URL="rabbitmq://localhost:5672/amq.direct?queue=%s&routingKey=%s&autoDelete=false";

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		fromF(RABBIT_URL, SENDER,SENDER)
		.unmarshal().json(JsonLibrary.Jackson,TransactionDto.class)
		.wireTap(AUDIT_TRANSACTION_ROUTE)
		.bean(transactionProcessor)
		.marshal().json(JsonLibrary.Jackson,TransactionDto.class)
		.toF(RABBIT_URL, RECEIVER,RECEIVER)
		.log("Log Money Transaction ${body}");
		
		
		from(AUDIT_TRANSACTION_ROUTE)
		.bean(transactionProcessor)
		.marshal().json(JsonLibrary.Jackson,TransactionDto.class)
		.toF(RABBIT_URL, AUDIT,AUDIT);


		
		
	}

}
