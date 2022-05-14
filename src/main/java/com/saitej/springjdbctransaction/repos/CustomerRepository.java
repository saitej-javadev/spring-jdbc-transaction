package com.saitej.springjdbctransaction.repos;


import com.saitej.springjdbctransaction.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class CustomerRepository {

    public static final String INSERT_CUSTOMER = "insert into Customer(id,name)values(?,?)";
    public static final String INSERT_ADDRESS = "insert into Address(id,address,country)values(?,?,?)";

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void create(Customer customer) {

        jdbcTemplate.update(INSERT_CUSTOMER, ps -> {
            ps.setInt(1, customer.getId());
            ps.setString(2, customer.getName());
        });

        log.info("Customer Data Inserted Successfully.......!");

        jdbcTemplate.update(INSERT_ADDRESS, ps -> {
            ps.setInt(1, customer.getId());
            ps.setString(2, customer.getAddress().getAddress());
            ps.setString(3, customer.getAddress().getCountry());
        });

        log.info("Address Data Inserted Successfully.......!");

    }
}