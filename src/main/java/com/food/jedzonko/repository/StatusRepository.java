package com.food.jedzonko.repository;

import com.food.jedzonko.entities.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Integer> {
}
