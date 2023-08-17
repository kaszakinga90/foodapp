CREATE TABLE restaurant (
    restaurant_id SERIAL NOT NULL,
    owner_id INT NOT NULL,
    restaurant_name VARCHAR(100) NOT NULL,
    PRIMARY KEY(restaurant_id),
    FOREIGN KEY (owner_id) REFERENCES restaurant_owner(owner_id)
);