package com.food.jedzonko.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "restaurantDeliveryStreetsId")
@ToString(of = {"restaurantDeliveryStreetsId", "restaurant", "street"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurant_delivery_streets")
public class RestaurantDeliveryStreetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_delivery_streets_id")
    private Integer restaurantDeliveryStreetsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "street_id")
    private StreetEntity street;

}
