package com.example.abbank.service.customer.api;

import com.example.abbank.service.customer.dto.CustomerInfoDTO;
import com.example.abbank.service.customer.service.CustomerInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerInfoService customerInfoService;
    @PostMapping("/get-customer-info")
    public CustomerInfoDTO getCustomerInfo(@RequestParam("id") Integer Id){
        return customerInfoService.getCustomerInfo(Id);
    }
}
