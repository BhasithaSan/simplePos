package com.github.BhasithaSan.ecommerce.Controller;

import com.github.BhasithaSan.ecommerce.DTO.OrderTotalResponse;
import com.github.BhasithaSan.ecommerce.DTO.ProductDto;
import com.github.BhasithaSan.ecommerce.Model.Product.Product;
import com.github.BhasithaSan.ecommerce.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class OrderController {

    public OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/processTally")
    public ResponseEntity<OrderTotalResponse> processTally(@RequestBody List<ProductDto> products) {
        float tally = orderService.processTally(products);

        if (tally != 0) {
            OrderTotalResponse orderTotalResponse = new OrderTotalResponse(tally, 200, "success");
            return ResponseEntity.ok(orderTotalResponse);
        } else {
            OrderTotalResponse orderTotalResponse = new OrderTotalResponse(tally, 404, "fail");
            return ResponseEntity.status(404).body(orderTotalResponse);
        }
    }

}
