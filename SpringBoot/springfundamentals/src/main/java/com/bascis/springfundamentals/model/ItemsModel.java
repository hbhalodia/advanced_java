package com.bascis.springfundamentals.model;

public class ItemsModel {

    private Long id;

    private CartModel cart;

    public ItemsModel() {
        super();
    }

    public ItemsModel(Long id, CartModel cart) {
        this.id = id;
        this.cart = cart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CartModel getCart() {
        return cart;
    }

    public void setCart(CartModel cart) {
        this.cart = cart;
    }
}
