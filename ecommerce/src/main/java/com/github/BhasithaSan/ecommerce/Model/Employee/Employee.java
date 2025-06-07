package com.github.BhasithaSan.ecommerce.Model.Employee;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {

    @Id
    @Column(name="EMPID")
    private String id;
    private String name;


    @ManyToOne
    @JoinColumn(name="MANAGERID")
    private Employee manager;


    private String mobile;
    private String Address;
    private String City;

    public Employee() {
    }

    public Employee(String id, String name, Employee manager, String mobile, String address, String city) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.mobile = mobile;
        Address = address;
        City = city;
    }

//    public List<Payroll> getPayrolls() {
//        return payrolls;
//    }
//
//    public void setPayrolls(List<Payroll> payrolls) {
//        this.payrolls = payrolls;
//    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
