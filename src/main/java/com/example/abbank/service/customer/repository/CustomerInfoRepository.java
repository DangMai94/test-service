package com.example.abbank.service.customer.repository;

import com.example.abbank.service.customer.entity.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Integer> {
    CustomerInfo getById(Integer Id);
}
