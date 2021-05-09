package com.duyle.rentcloud.profileservice.controller;

import com.duyle.rentcloud.commons.model.Customer;
import com.duyle.rentcloud.profileservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {
    private final CustomerService customerService;

    public ProfileController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping(value = "/profile")
    public Customer fetch(@RequestParam int profileId) {
        return customerService.fetchById(profileId);
    }

    @GetMapping(value = "/profiles")
    public List<Customer> fetch() {
        return customerService.fetchAllProfiles();
    }
}
