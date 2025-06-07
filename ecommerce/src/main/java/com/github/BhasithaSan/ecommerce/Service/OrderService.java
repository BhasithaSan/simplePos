package com.github.BhasithaSan.ecommerce.Service;
import com.github.BhasithaSan.ecommerce.DTO.ProductDto;
import com.github.BhasithaSan.ecommerce.Model.Product.Product;
import com.github.BhasithaSan.ecommerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    public ProductRepository productRepository;

    @Autowired
    public OrderService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Cacheable(value = "productPrice", key = "#id")
    public Float getCachedUnitPrice(String id) {

        System.out.println("Product Id for"+id+"got from db");

        Optional<Float> optionalUnitPrice=productRepository.findUnitPriceById(id);
        if(optionalUnitPrice.isPresent()){
            return optionalUnitPrice.get();
        }
        else{
            float x=-1;
             return x;
        }
    }



    public Float processTally(List<ProductDto> products) {
        float total = 0;

        for (ProductDto dto : products) {

            Float unitPrice = getCachedUnitPrice(dto.getId());
            if(unitPrice<0){
                return unitPrice;
            }
            total += unitPrice * dto.getQuantity();
        }

        return total;
    }




}
