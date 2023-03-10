package com.example.ceb.controller;

import com.example.ceb.dto.CustomerDTO;
import com.example.ceb.dto.ResponseDTO;
import com.example.ceb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ResponseDTO responseDTO;

    @PostMapping(value = "/saveCustomer")
    public CustomerDTO SaveCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.SaveCustomer(customerDTO);
    }


}
