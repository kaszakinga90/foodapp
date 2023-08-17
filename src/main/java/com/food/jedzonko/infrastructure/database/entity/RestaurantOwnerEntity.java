package com.food.jedzonko.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "ownerId")
@ToString(of = {"ownerId", "ownerName"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurant_owner")
public class RestaurantOwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Integer ownerId;

    @Column(name = "owner_name")
    private String ownerName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner")
    private Set<RestaurantEntity> restaurants;
}
