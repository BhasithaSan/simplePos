package com.github.BhasithaSan.ecommerce.Repository;

import com.github.BhasithaSan.ecommerce.Model.Employee.Employee;
import com.github.BhasithaSan.ecommerce.Model.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {


}
