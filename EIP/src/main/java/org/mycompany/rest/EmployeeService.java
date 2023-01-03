package org.mycompany.rest;

public interface EmployeeService {

	ListResponse<EmployeeDto> getAll();
 	EmployeeDto getById(Long id);
	EmployeeDto save(EmployeeDto employeeDto);
	void delete(Long id);
	EmployeeDto update(EmployeeDto employeeDto, Long id) throws Exception;
}
