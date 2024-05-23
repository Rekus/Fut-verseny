INSERT INTO runner (name, age, gender) VALUES ('Kis Anna', 30, 'Nő');
INSERT INTO runner (name, age, gender) VALUES ('Nagy Ádám', 28, 'Férfi');
INSERT INTO runner (name, age, gender) VALUES ('Harmat Eszter', 35, 'Nő');
INSERT INTO runner (name, age, gender) VALUES ('Kovács István', 25, 'Férfi');

INSERT INTO race (name, distance) VALUES ('5K Run', 5.0);
INSERT INTO race (name, distance) VALUES ('Marathon', 42.195);

INSERT INTO result (runner_id, race_id, time) VALUES (1, 1, 25);
INSERT INTO result (runner_id, race_id, time) VALUES (2, 1, 28);
INSERT INTO result (runner_id, race_id, time) VALUES (3, 2, 52);
INSERT INTO result (runner_id, race_id, time) VALUES (4, 2, 48);
INSERT INTO result (runner_id, race_id, time) VALUES (1, 2, 50);
INSERT INTO result (runner_id, race_id, time) VALUES (2, 2, 55);


