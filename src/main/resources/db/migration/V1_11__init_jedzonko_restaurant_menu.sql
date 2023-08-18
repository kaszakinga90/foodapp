CREATE TABLE restaurant_menu
(
    restaurant_menu_id serial NOT NULL,
    restaurant_id integer NOT NULL,
    item_id integer NOT NULL,
    PRIMARY KEY(restaurant_menu_id),
    FOREIGN KEY (restaurant_id) REFERENCES restaurant (restaurant_id),
    FOREIGN KEY (item_id) REFERENCES menu_item (item_id)
);