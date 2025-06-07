package com.github.BhasithaSan.ecommerce.Controller;

import com.github.BhasithaSan.ecommerce.DTO.EmployeePayroll;
import com.github.BhasithaSan.ecommerce.Model.Employee.Employee;
import com.github.BhasithaSan.ecommerce.Model.Employee.Payroll;
import com.github.BhasithaSan.ecommerce.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }




    @GetMapping("employee/{empId}/payroll")
    public List<Payroll> getEmployeePayroll(@PathVariable String empId){

        return employeeService.getEmployeePayroll(empId);
    }
}
