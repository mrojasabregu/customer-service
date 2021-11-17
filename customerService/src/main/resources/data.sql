DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS address;

CREATE TABLE customer(
  id_customer VARCHAR(255) NOT NULL PRIMARY KEY,
  name VARCHAR(255),
  last_name VARCHAR(255),
  document_type VARCHAR(10),
  document_number BIGINT,
  email VARCHAR(255),
  phone VARCHAR(255)
);

CREATE TABLE address(
  id_address VARCHAR(255) NOT NULL PRIMARY KEY,
  city VARCHAR(255),
  street VARCHAR(255),
  street_number INT,
  floor_number INT,
  flat VARCHAR(255),
  id_customer VARCHAR(255)
);