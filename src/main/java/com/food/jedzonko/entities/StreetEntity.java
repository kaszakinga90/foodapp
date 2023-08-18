package com.food.jedzonko.entities;

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

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "deliveryStreets")
    private Set<RestaurantEntity> restaurants;
}
