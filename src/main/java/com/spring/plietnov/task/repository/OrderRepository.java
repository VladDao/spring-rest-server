package com.spring.plietnov.task.repository;

import com.spring.plietnov.task.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
