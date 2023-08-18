package com.food.jedzonko.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "statusId")
@ToString(of = {"statusId", "statusName"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "status")
public class StatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private Integer statusId;

    @Column(name = "status_name")
    private String statusName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
    private Set<OrderEntity> orders;
}
