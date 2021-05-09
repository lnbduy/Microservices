package com.duyle.rentcloud.profileservice.controller;

import com.duyle.rentcloud.commons.model.Customer;
import com.duyle.rentcloud.profileservice.service.CustomerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/services")
public class ProfileController {
    private final CustomerService customerService;

    public ProfileController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
