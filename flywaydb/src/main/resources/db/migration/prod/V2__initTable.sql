CREATE SCHEMA IF NOT EXISTS production AUTHORIZATION "sd-dev";

CREATE TABLE production.refresh_token (
    id bigserial PRIMARY KEY,
    account_id bigint,
    email character varying(255),
    token character varying(255)
);

CREATE TABLE production.users (
    id bigserial PRIMARY KEY,
    email varchar(255),
    name varchar(255),
    password varchar(255)
);