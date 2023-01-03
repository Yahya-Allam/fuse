package org.mycompany.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public ListResponse<EmployeeDto> getAll() {
 		return new ListResponse<>(employeeMapper.listToDto(employeeDao.findAll()));
 	}

	@Override
	public EmployeeDto getById(Long id) {
		return employeeMapper
				.entityToDto(employeeDao.findById(id).orElseThrow(() -> new NotFoundException("no id founded", "emp-01")));
	}

	@Override
	public EmployeeDto save(EmployeeDto employeeDto) {
		Employee employee = employeeMapper.dtoToEntity(employeeDto);
		employee = employeeDao.save(employee);
		return employeeMapper.entityToDto(employee);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);	

		
	}

	@Override
	public EmployeeDto update(EmployeeDto employeeDto, Long id) throws Exception {
		Employee employee=employeeDao.findById(id).orElseThrow(() -> new NotFoundException("no id founded", "emp-01"));
		employeeMapper.updateEntityFromDto(employeeDto, employee);
		employee = employeeDao.save(employee);
		return employeeMapper.entityToDto(employee);
	}


}
