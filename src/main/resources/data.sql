CREATE TABLE venue (
                       id INTEGER NOT NULL PRIMARY KEY,
                       link_more_info VARCHAR(255),
                       venue_name VARCHAR(255)

);

CREATE TABLE faciliteiten (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              max_persons INT,
                              public_transport_distance VARCHAR(255),
                              food_provided BOOLEAN,
                              indoor BOOLEAN,
                              outdoor BOOLEAN,
                              free_parking BOOLEAN
);

INSERT INTO faciliteiten (max_persons, public_transport_distance, food_provided, indoor, outdoor, free_parking)
VALUES (150, '2km van openbaar vervoer', false, true, false, true);