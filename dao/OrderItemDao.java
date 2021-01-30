package com.studymall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studymall.entity.OrderItem;

import java.util.List;

public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {
    /**
     * 根据订单Id查询
     * @param orderId
     * @return
     */
    List<OrderItem> findByOrderId(int orderId);
}
