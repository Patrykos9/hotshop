package com.shop.hotshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

public class Item {

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    private String name;
    private BigDecimal price;
    private String img;
}
