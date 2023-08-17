CREATE TABLE restaurant_delivery_streets
(
    restaurant_delivery_streets_id serial NOT NULL,
    restaurant_id integer NOT NULL,
    street_id integer NOT NULL,
    PRIMARY KEY(restaurant_delivery_streets_id),
    FOREIGN KEY (restaurant_id) REFERENCES restaurant (restaurant_id),
    FOREIGN KEY (street_id) REFERENCES street (street_id)
);