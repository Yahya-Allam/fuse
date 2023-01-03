package org.mycompany.rest;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class EmployeeDto {
	private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;

    

}
 