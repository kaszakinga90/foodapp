package com.food.jedzonko.repository;

import com.food.jedzonko.entities.StreetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface StreetRepository extends JpaRepository<StreetEntity, Integer> {
}
