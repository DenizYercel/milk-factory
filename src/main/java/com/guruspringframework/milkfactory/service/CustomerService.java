package com.guruspringframework.milkfactory.service;

import com.guruspringframework.milkfactory.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
