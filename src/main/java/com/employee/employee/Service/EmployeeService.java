package com.employee.employee.Service;

import com.employee.employee.Entity.EmployeeEntity;


import java.util.List;

public interface EmployeeService {

    EmployeeEntity createEmployee(EmployeeEntity employee);

    List<EmployeeEntity> getAllEmployee();

    EmployeeEntity getEmployeeId (Long id);

    EmployeeEntity updateEmployee (Long id , EmployeeEntity employee);

    EmployeeEntity deleteEmployee (Long id);
}
