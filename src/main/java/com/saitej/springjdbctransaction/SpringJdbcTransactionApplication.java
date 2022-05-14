package com.saitej.springjdbctransaction;

import com.saitej.springjdbctransaction.model.Address;
import com.saitej.springjdbctransaction.model.Customer;
import com.saitej.springjdbctransaction.services.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcTransactionApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringJdbcTransactionApplication.class, args);
        CustomerService bean = run.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Joe");
        Address address = new Address();
        address.setId(1);
          address.setAddress("Albany Dr, San Jose, CA 95129");
       // address.setAddress("Hyderabad");
        address.setCountry("India");
        customer.setAddress(address);
        bean.create(customer);
        System.out.println(customer);
        System.out.println(address);

    }

}
