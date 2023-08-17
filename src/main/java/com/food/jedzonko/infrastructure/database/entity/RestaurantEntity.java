package com.food.jedzonko.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "restaurantId")
@ToString(of = {"restaurantId", "owner", "restaurantName"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Integer restaurantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private RestaurantOwnerEntity owner;

    @Column(name = "restaurant_name")
    private String restaurantName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
    private Set<StreetEntity> deliveryStreets;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
    private Set<MenuItemEntity> menuItems;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
    private Set<OrderEntity> orders;
}
