CREATE TABLE order_item (
    order_item_id SERIAL NOT NULL,
    order_id INT NOT NULL,
    item_id INT NOT NULL,
    quantity INT NOT NULL,
    PRIMARY KEY (order_item_id),
    FOREIGN KEY (order_id) REFERENCES "order"(order_id),
    FOREIGN KEY (item_id) REFERENCES menu_item(item_id)
);