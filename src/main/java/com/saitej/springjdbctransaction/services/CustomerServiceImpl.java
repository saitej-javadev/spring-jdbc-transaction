package com.saitej.springjdbctransaction.services;

import com.saitej.springjdbctransaction.model.Customer;
import com.saitej.springjdbctransaction.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;


   // @Transactional
    @Override
    public void create(Customer customer) {
        customerRepository.create(customer);
    }
}

