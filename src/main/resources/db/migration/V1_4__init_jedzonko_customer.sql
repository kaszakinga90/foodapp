CREATE TABLE customer (
    customer_id SERIAL NOT NULL,
    customer_name VARCHAR(50) NOT NULL,
    street_id INT,
    phone VARCHAR(32),
    FOREIGN KEY (street_id) REFERENCES street(street_id),
    PRIMARY KEY(customer_id),
    UNIQUE (phone)
);