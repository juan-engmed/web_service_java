package com.engmed.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engmed.practice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
