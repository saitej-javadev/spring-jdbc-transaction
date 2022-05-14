package com.saitej.springjdbctransaction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    private int id;
    private String address;
    private String country;
}
