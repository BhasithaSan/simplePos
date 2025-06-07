package com.github.BhasithaSan.ecommerce.Repository;

import com.github.BhasithaSan.ecommerce.DTO.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.github.BhasithaSan.ecommerce.Model.Product.Product;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    @Query("SELECT p.unitPrice FROM Product p WHERE p.id = :id")
    Optional<Float> findUnitPriceById(@Param("id") String id);

}