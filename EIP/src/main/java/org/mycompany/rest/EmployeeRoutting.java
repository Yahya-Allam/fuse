package org.mycompany.rest;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

//@Component
public class EmployeeRoutting extends RouteBuilder {
	private final Environment env;

	public EmployeeRoutting(Environment env) {
		// TODO Auto-generated constructor stub
		this.env = env;
	}

 

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		restConfiguration().contextPath(env.getProperty("camel.component.servlet.mapping.contextPath", "/rest/*"))
				.apiContextPath("/api-doc").apiProperty("api.title", "Spring Boot Camel Postgres Rest API.")
				.apiProperty("api.version", "1.0").apiProperty("cors", "true").apiContextRouteId("doc-api")
				.port(8080).bindingMode(RestBindingMode.json);	

		rest("/emp").consumes(MediaType.APPLICATION_JSON_VALUE).produces(MediaType.APPLICATION_JSON_VALUE).get("/{id}")
				.route().to("{{route.getById}}").endRest().get("/").route().to("{{route.getAll}}").endRest().post("/")
				.route().marshal().json(JsonLibrary.Jackson, EmployeeDto.class).unmarshal()
				.json(JsonLibrary.Jackson, EmployeeDto.class).to("{{route.save}}").endRest().delete("/{id}").route()
				.to("{{route.delete}}").end();

		from("{{route.getById}}").log("Received header : ${header.id}").bean(EmployeeServiceImpl.class,
				"getById(${header.id})");

		from("{{route.getAll}}").bean(EmployeeServiceImpl.class, "getAll");

		from("{{route.save}}").log("Received Body ${body}").bean(EmployeeServiceImpl.class, "save(${body})");

		from("{{route.delete}}").log("Received header : ${header.id}").bean(EmployeeServiceImpl.class,
				"delete(${header.id})");

	}

}
