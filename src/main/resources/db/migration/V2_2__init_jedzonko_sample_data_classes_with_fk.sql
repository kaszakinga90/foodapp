-- Wprowadzenie przykładowych klientów
INSERT INTO customer (customer_name, street_id) VALUES
                                                    ('Lila Ja', 1),
                                                    ('Janeczeek', 2),
                                                    ('Krysia Nowak', 1),
                                                    ('Leopold Czarny', 2);


-- Wprowadzenie przykładowych właścicieli lokali gastronomicznych
INSERT INTO restaurant_owner (owner_id, owner_name) VALUES
                                                        (1,'Firma Lizaczek'),
                                                        (2, 'Krzysztof Kowalski'),
                                                        (3, 'Schabik Lucyna'),
                                                        (4, 'Pyszne Sp zoo');

-- Wprowadzenie przykładowych lokali gastronomicznych
INSERT INTO restaurant (owner_id, restaurant_name) VALUES
                                                                  (1, 'U Kevina'),
                                                                  (2, 'Latajace smaki');

-- Wprowadzenie przykładowych dań w menu
INSERT INTO menu_item (category_id, item_name, price) VALUES
                                                                         (1, 'Appetizer 1', 7.99),
                                                                         (2, 'Soup 1', 4.50),
                                                                         (3, 'Main Dish 1', 12.75),
                                                                         (1, 'Appetizer 2', 6.50),
                                                                         (3, 'Main Dish 2', 11.25);


-- Wprowadzenie przykładowych zamówień
INSERT INTO "order" (customer_id, restaurant_id, status_id) VALUES
                                                                (1, 1, 1),
                                                                (1, 2, 1);

-- Wprowadzenie przykładowych pozycji w zamówieniach
INSERT INTO order_item (order_id, item_id, quantity) VALUES
                                                         (1, 1, 2),
                                                         (2, 4, 1);


-- Wprowadzenie przykładowych ulic obslugiwanych przez restauracje
INSERT INTO restaurant_delivery_streets (restaurant_id, street_id) VALUES
                                                                  (1, 1),
                                                                  (1, 2),
                                                                  (1, 3),
                                                                  (2, 2);

-- Wprowadzenie przykładowych pozycji menu dla restauracji
INSERT INTO restaurant_menu (restaurant_id, item_id) VALUES
                                                                       (1, 1),
                                                                       (1, 2),
                                                                       (1, 3),
                                                                       (2, 2);
