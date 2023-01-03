package org.mycompany.restapi;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.mycompany.erp.ERPProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
 
//@Component
public class RouttingRest extends RouteBuilder {
	@Autowired
	ERPProcessor erpProcessor;

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		restConfiguration().contextPath("/serivce/*").apiContextPath("/api-doc")
				.apiProperty("api.title", "Spring Boot.").apiProperty("api.version", "1.0")
				.apiProperty("cors", "true").apiContextRouteId("doc-api").bindingMode(RestBindingMode.json);

		     rest("/say")
	        .get("/hello").to("direct:hello")
	        .get("/bye").consumes(MediaType.APPLICATION_JSON_VALUE).produces(MediaType.APPLICATION_JSON_VALUE).to("direct:bye")
 	        ;

	    from("direct:hello")
	        .transform().constant("Hello World");

	    from("direct:bye")
//	    .marshal().json(JsonLibrary.Jackson,ERPDto.class)
	    .process(erpProcessor)
 	    .setHeader(Exchange.HTTP_METHOD, constant("POST"))
	    .log("Logging header ${headers}")
        .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
        .log("Logging header ${headers}")
        .setHeader("Accept",constant("application/json"))
        .log("Logging header ${headers}")
        .log(">> - ${body}")
//        .convertBodyTo(String.class)
        .marshal().json(JsonLibrary.Jackson)
 
//        .marshal().json(JsonLibrary.Jackson,ERPDto.class)
//        .marshal().json().unmarshal(getJacksonDataFormat(ERPDto.class))
//         .unmarshal().json(JsonLibrary.Jackson,ERPDto.class)
        .to("http://localhost:9091/api/SelfService/SearchEmployeeByEmpIdOrNameWithPagination")
	         ;

	}
	
	
	private JacksonDataFormat getJacksonDataFormat(Class<?> unmarshalType) {
		JacksonDataFormat format = new JacksonDataFormat();
		format.setUnmarshalType(unmarshalType);
		return format;
	}

}
