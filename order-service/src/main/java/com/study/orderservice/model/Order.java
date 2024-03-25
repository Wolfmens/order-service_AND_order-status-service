package com.study.orderservice.model;

import lombok.Data;

@Data
public class Order {

    private Long id;

    private String product;

    private Integer quantity;

}
