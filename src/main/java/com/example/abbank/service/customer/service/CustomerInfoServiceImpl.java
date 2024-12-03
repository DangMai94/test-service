package com.example.abbank.service.customer.service;

import com.example.abbank.service.customer.dto.CustomerInfoDTO;
import com.example.abbank.service.customer.entity.CustomerInfo;
import com.example.abbank.service.customer.repository.CustomerInfoRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerInfoServiceImpl implements CustomerInfoService{

    private final ModelMapper modelMapper;
    private final CustomerInfoRepository repository;
    @Override
    public CustomerInfoDTO getCustomerInfo(Integer Id) {
        CustomerInfo customerInfo = repository.getById(Id);
        CustomerInfoDTO customerInfoDTO = modelMapper.map(customerInfo, CustomerInfoDTO.class);
        return customerInfoDTO;
    }
}
