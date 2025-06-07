package com.github.BhasithaSan.ecommerce.Service;

import com.github.BhasithaSan.ecommerce.Model.Employee.Payroll;
import com.github.BhasithaSan.ecommerce.Repository.EmployeeRepository;
import com.github.BhasithaSan.ecommerce.Repository.PayRollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;
    PayRollRepository payRollRepository;
    @Autowired
    public EmployeeService (EmployeeRepository employeeRepository, PayRollRepository payRollRepository){
        this.employeeRepository=employeeRepository;
        this.payRollRepository=payRollRepository;
    }

    public List<Payroll> getEmployeePayroll(String empId){

//        this will create 2 seperate requests to the db,can become an overhead.
//        therefore we can create custom query in employee repository
//        Optional<Employee> optionalEmployee=employeeRepository.findById(empId);
//        List<Payroll> payroll= payRollRepository.findByEmpId(empId);
//


        List<Payroll> payroll=payRollRepository.findEmployeeWithPayrolls(empId);


        return payroll;
    }
}
