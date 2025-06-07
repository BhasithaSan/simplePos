package com.github.BhasithaSan.ecommerce.DTO;

import com.github.BhasithaSan.ecommerce.Model.Employee.Employee;
import com.github.BhasithaSan.ecommerce.Model.Employee.Payroll;
import java.util.List;

public class EmployeePayroll {
    private Employee employee;
    private List<Payroll> payrollList;

    public EmployeePayroll(Employee employee, List<Payroll> payrollList) {
        this.employee = employee;
        this.payrollList = payrollList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public List<Payroll> getPayrollList() {
        return payrollList;
    }
}
