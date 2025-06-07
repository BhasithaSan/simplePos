package com.github.BhasithaSan.ecommerce.Model.Employee;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Payroll")
public class Payroll {

    @Id
    @Column(length = 5,name="PAYROLLID")
    private String payrollId;


    @JoinColumn(name="EMPID")
    @ManyToOne
    private Employee employee;


    @Column(name="STARTINGDATE")
    private LocalDate startingDate;
    @Column(name="ENDINGDATE")
    private LocalDate endingDate;
    @Column(name="PAIDDATE")
    private LocalDate paidDate;
    @Column(name="GROSSSAL")
    private Float grossSal;
    private Float deduction;
    @Column(name="NETSAL")
    private Float netSal;

    // Constructors
    public Payroll() {
    }

    public Payroll(String payrollId, Employee employee, String name, LocalDate startingDate,
                   LocalDate endingDate, LocalDate paidDate, Float grossSal,
                   Float deduction, Float netSal) {
        this.payrollId = payrollId;
        this.employee = employee;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.paidDate = paidDate;
        this.grossSal = grossSal;
        this.deduction = deduction;
        this.netSal = netSal;
    }

    // Getters and Setters
    public String getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(String payrollId) {
        this.payrollId = payrollId;
    }

    public Employee getEmpId() {
        return employee;
    }

    public void setEmpId(Employee employee) {
        this.employee = employee;
    }


    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDate paidDate) {
        this.paidDate = paidDate;
    }

    public Float getGrossSal() {
        return grossSal;
    }

    public void setGrossSal(Float grossSal) {
        this.grossSal = grossSal;
    }

    public Float getDeduction() {
        return deduction;
    }

    public void setDeduction(Float deduction) {
        this.deduction = deduction;
    }

    public Float getNetSal() {
        return netSal;
    }

    public void setNetSal(Float netSal) {
        this.netSal = netSal;
    }
}