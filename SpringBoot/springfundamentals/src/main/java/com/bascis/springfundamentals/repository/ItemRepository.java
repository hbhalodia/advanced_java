package com.bascis.springfundamentals.repository;

import com.bascis.springfundamentals.entity.EItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<EItems, Long> {
}
