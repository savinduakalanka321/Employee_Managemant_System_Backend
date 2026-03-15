package com.employee.employee.Controller;

import com.employee.employee.Entity.EmployeeEntity;
import com.employee.employee.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/create")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/all")
    public List<EmployeeEntity> getAllEmployee (){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeId(@PathVariable Long id){
        return employeeService.getEmployeeId(id);
    }

    @PutMapping("/update/{id}")
    public EmployeeEntity updateEmployee(@PathVariable Long id , @RequestBody EmployeeEntity employee){
        return employeeService.updateEmployee(id,employee);
    }

}
