/*
 * (Just to show how I set the data up to test my query.)
 */
CREATE TABLE users (
    user_id INT(6) PRIMARY KEY,
    username VARCHAR(30) NOT NULL
);

CREATE TABLE training_details (
    user_training_id INT(6) PRIMARY KEY,
    user_id INT(6) not null,
    training_id INT(6) not null,
    training_date VARCHAR(10) not null,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

insert into users values (1, 'John Doe');
insert into users values (2, 'Jane Don');
insert into users values (3, 'Alice Jones');
insert into users values (4, 'Lisa Romero');

insert into training_details values (1, 1, 1, '2015-08-02');
insert into training_details values (6, 1, 1, '2015-08-02');
insert into training_details values (13, 1, 1, '2015-08-02');
insert into training_details values (9, 1, 4, '2015-08-03');
insert into training_details values (2, 2, 1, '2015-08-03');
insert into training_details values (5, 2, 2, '2015-08-03');
insert into training_details values (3, 3, 2, '2015-08-02');
insert into training_details values (7, 3, 2, '2015-08-04');
insert into training_details values (12, 3, 2, '2015-08-02');
insert into training_details values (10, 3, 1, '2015-08-02');
insert into training_details values (4, 4, 2, '2015-08-04');
insert into training_details values (11, 4, 2, '2015-08-04');
insert into training_details values (8, 4, 3, '2015-08-03');
insert into training_details values (14, 4, 3, '2015-08-03');
