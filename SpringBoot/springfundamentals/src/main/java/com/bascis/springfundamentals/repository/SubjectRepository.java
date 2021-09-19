package com.bascis.springfundamentals.repository;

import com.bascis.springfundamentals.entity.ESubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<ESubject, Long> {
}
