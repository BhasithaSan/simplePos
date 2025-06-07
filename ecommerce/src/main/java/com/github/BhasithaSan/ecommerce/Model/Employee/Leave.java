package com.github.BhasithaSan.ecommerce.Model.Employee;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Leave")
public class Leave {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "employeeId", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "managerId")
    private Employee manager;

    private LocalDate leaveDate;

    private String status;

    private int numberOfDays;  // Changed to int since it's numeric

    public Leave() {
    }

    public Leave(String id, Employee employee, Employee manager, LocalDate leaveDate, String status, int numberOfDays) {
        this.id = id;
        this.employee = employee;
        this.manager = manager;
        this.leaveDate = leaveDate;
        this.status = status;
        this.numberOfDays = numberOfDays;
    }

    // Getters and setters...

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDate leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
