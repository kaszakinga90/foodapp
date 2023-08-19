package com.food.jedzonko.repository;

import com.food.jedzonko.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

    @Query("SELECT o FROM OrderEntity o WHERE o.restaurant.restaurantId = :restaurantId")
    List<OrderEntity> findByRestaurantId(@Param("restaurantId") Integer restaurantId);

    @Query("SELECT o FROM OrderEntity o WHERE o.customer.customerId = :customerId order by o.orderTime")
    OrderEntity findCustomerCurrentOrder(Integer customerId);


}
