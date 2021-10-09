package com.bascis.springfundamentals.model;

import com.bascis.springfundamentals.entity.EItems;

import java.util.Set;

public class CartModel {

    private Long id;

    private Set<ItemsModel> items;

    public CartModel() {
        super();
    }

    public CartModel(Long id, Set<ItemsModel> items) {
        this.id = id;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ItemsModel> getItems() {
        return items;
    }

    public void setItems(Set<ItemsModel> items) {
        this.items = items;
    }
}
