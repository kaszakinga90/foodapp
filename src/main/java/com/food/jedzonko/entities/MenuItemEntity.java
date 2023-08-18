package com.food.jedzonko.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "itemId")
@ToString(of = {"itemId", "category", "itemName", "description"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu_item")
public class MenuItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Integer itemId;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "menu")
    private Set<RestaurantEntity> restaurants;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "item_image_url")
    private String itemImageUrl;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menuItem")
    private Set<OrderItemEntity> orderItems;
}
