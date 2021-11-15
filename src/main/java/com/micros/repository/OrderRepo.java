package com.micros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micros.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
