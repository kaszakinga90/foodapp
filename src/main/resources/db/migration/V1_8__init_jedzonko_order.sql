CREATE TABLE "order" (
    order_id SERIAL NOT NULL,
    customer_id INT NOT NULL,
    restaurant_id INT NOT NULL,
    order_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status_id INT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id),
    FOREIGN KEY (status_id) REFERENCES status(status_id),
    PRIMARY KEY (order_id)
);