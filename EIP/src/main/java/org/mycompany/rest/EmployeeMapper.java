package org.mycompany.rest;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface EmployeeMapper extends BasicMapper<Employee, EmployeeDto> {

}
