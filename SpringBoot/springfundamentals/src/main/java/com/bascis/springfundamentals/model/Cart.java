package com.bascis.springfundamentals.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CART")
public class Cart {

    //...

    @OneToMany(mappedBy="cart")
    private Set<Items> items;

    // getters and setters
}
