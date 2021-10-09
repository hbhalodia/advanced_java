package com.bascis.springfundamentals.entity;

import javax.persistence.*;

@Entity
@Table(name="items")
public class EItems {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private ECart cart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ECart getCart() {
        return cart;
    }

    public void setCart(ECart cart) {
        this.cart = cart;
    }
}
