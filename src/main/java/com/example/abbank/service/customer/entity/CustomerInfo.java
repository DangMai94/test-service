package com.example.abbank.service.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "CUSTOMER_INFO")
@Setter
@Getter
@RequiredArgsConstructor
public class CustomerInfo {
    @Id
    @Column(name = "id")
    private Integer Id;
    @Column(name = "fist_name")
    private String fistName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "DOB")
    private String dob;
}
