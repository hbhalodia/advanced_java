package com.bascis.springfundamentals.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="cart")
public class ECart {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="cart")
    private Set<EItems> items;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<EItems> getItems() {
        return items;
    }

    public void setItems(Set<EItems> items) {
        this.items = items;
    }
}
