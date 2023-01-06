package com.example.ceb.service;

import com.example.ceb.dto.CustomerDTO;
import com.example.ceb.entity.Customer;
import com.example.ceb.repo.CustomerRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public CustomerDTO SaveCustomer(CustomerDTO customerDTO){
    customerRepo.save(modelMapper.map(customerDTO, Customer.class));
    return customerDTO;
    }


}
