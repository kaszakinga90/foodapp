CREATE TABLE menu_item (
    item_id SERIAL NOT NULL,
    restaurant_id INT NOT NULL,
    category_id INT NOT NULL,
    item_name VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    item_image_url VARCHAR(200),
    PRIMARY KEY (item_id),
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id),
    FOREIGN KEY (category_id) REFERENCES category(category_id)
);