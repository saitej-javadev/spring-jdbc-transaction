package com.saitej.springjdbctransaction;

import com.saitej.springjdbctransaction.model.Address;
import com.saitej.springjdbctransaction.model.Customer;
import com.saitej.springjdbctransaction.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringJdbcTransactionApplicationTests {

    @Autowired
    CustomerService customerService;

    @Test
    void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Joe");
        Address address = new Address();
        address.setId(1);
      //  address.setAddress("Albany Dr, San Jose, CA 95129");
        address.setAddress("Hyderabad");
        address.setCountry("India");
        customer.setAddress(address);
        customerService.create(customer);
        System.out.println(customer);
        assertNotNull(customer);
    }
}
