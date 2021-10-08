package com.bascis.springfundamentals.repository;

import com.bascis.springfundamentals.entity.ETodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<ETodo, Long> {
}
