package com.github.BhasithaSan.ecommerce.Service;

import com.github.BhasithaSan.ecommerce.Model.Product.Product;
import com.github.BhasithaSan.ecommerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepo) {
        this.productRepository = productRepo;
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public List<Product> getProducts(){

        return productRepository.findAll();

    }
}