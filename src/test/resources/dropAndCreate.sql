CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE USER postgres WITH CREATEDB PASSWORD 'password';
CREATE DATABASE test_database WITH OWNER = postgres;
GRANT ALL PRIVILEGES ON DATABASE test_database TO postgres;