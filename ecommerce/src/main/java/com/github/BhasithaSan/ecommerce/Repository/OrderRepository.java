package com.github.BhasithaSan.ecommerce.Repository;

import com.github.BhasithaSan.ecommerce.Model.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Employee, String> {
}
