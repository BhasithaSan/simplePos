package com.github.BhasithaSan.ecommerce.Model.Order;

import com.github.BhasithaSan.ecommerce.Model.Customer.Customer;
import com.github.BhasithaSan.ecommerce.Model.Employee.Employee;
import com.github.BhasithaSan.ecommerce.Model.Process.POS;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Order {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "posId")
    private POS pos;

    @ManyToOne
    @JoinColumn(name = "empId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    private LocalDate orderDate;

    private float total;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    public Order() {
    }

    public Order(String id, POS pos, Employee employee, Customer customer, LocalDate orderDate, float total, List<OrderItem> orderItems) {
        this.id = id;
        this.pos = pos;
        this.employee = employee;
        this.customer = customer;
        this.orderDate = orderDate;
        this.total = total;
        this.orderItems = orderItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public POS getPos() {
        return pos;
    }

    public void setPos(POS pos) {
        this.pos = pos;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
