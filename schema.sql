-- Database: contacts

CREATE TABLE contact
(
  firstname character varying(255),
  lastname character varying(255),
  email character varying(255),
  telephone character varying(30),
  created date,
  id serial NOT NULL,
  CONSTRAINT "PK_00001" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);

INSERT INTO contact (firstname, lastname, email, telephone, created)
VALUES ('Hugo', 'Angeles', 'hugoangeles0810@gmail.com', '943644627', NOW());


