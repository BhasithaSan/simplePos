package com.github.BhasithaSan.ecommerce.Repository;

import com.github.BhasithaSan.ecommerce.Model.Order.OrderItem;
import com.github.BhasithaSan.ecommerce.Model.Order.OrderItemId;
import com.github.BhasithaSan.ecommerce.Model.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId> {
}
