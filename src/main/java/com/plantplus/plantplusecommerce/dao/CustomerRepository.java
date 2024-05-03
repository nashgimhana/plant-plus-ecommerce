package com.plantplus.plantplusecommerce.dao;

import com.plantplus.plantplusecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
