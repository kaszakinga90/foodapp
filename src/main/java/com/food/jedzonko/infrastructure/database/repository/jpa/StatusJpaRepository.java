package com.food.jedzonko.infrastructure.database.repository.jpa;

import com.food.jedzonko.infrastructure.database.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusJpaRepository extends JpaRepository<StatusEntity, Integer> {
}
