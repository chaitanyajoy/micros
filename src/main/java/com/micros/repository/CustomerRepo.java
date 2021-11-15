package com.micros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.micros.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
