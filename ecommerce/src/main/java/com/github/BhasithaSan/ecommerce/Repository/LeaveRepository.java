package com.github.BhasithaSan.ecommerce.Repository;

import com.github.BhasithaSan.ecommerce.Model.Employee.Leave;
import com.github.BhasithaSan.ecommerce.Model.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, String> {
}
