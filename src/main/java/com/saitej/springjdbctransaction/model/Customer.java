package com.saitej.springjdbctransaction.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    private int id;
    private String name;
    private Address address;
}
