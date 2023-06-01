CREATE SCHEMA IF NOT EXISTS development AUTHORIZATION "sd-dev";

CREATE TABLE development.refresh_token (
    id bigserial PRIMARY KEY,
    account_id bigint,
    email character varying(255),
    token character varying(255)
);

CREATE TABLE development.users (
    id bigserial PRIMARY KEY,
    email varchar(255),
    name varchar(255),
    password varchar(255)
);