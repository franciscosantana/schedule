CREATE TABLE users (
    user_id BIGSERIAL PRIMARY KEY NOT NULL,
    username VARCHAR(128) UNIQUE NOT NULL,
    password VARCHAR(256) NOT NULL,
    enabled BOOL NOT NULL
);

create sequence schedule.users_seq;

INSERT INTO users (user_id, username, password, enabled) VALUES 
	('1', 'user@domain.com', '$2a$10$D4OLKI6yy68crm.3imC9X.P2xqKHs5TloWUcr6z5XdOqnTrAK84ri', true);