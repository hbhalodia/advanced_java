package com.bascis.springfundamentals.repository;

import com.bascis.springfundamentals.entity.ECart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<ECart, Long>{
}
