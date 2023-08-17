package com.food.jedzonko.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "streetId")
@ToString(of = {"streetId", "streetName"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "street")
public class StreetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "street_id")
    private Integer streetId;

    @Column(name = "street_name")
    private String streetName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "street")
    private Set<CustomerEntity> customers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;
}
