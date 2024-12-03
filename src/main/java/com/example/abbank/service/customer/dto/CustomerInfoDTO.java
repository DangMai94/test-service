package com.example.abbank.service.customer.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CustomerInfoDTO {
    private Integer Id;
    private String fistName;
    private String lastName;
    private String dob;
}
