package com.github.BhasithaSan.ecommerce.Controller;


import com.github.BhasithaSan.ecommerce.Model.Product.Product;
import com.github.BhasithaSan.ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/")
public class ProductController {



    @Autowired
    ProductService productService;

    @GetMapping("products")
    public List<Product> getAllproducts(){
        return productService.getProducts();
    }
    @GetMapping("product/{id}")
    public Optional<Product> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }



}
