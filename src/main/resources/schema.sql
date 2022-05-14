CREATE TABLE Customer (
  id int(11)  NOT NULL,
  name varchar(20) ,
  PRIMARY KEY (id)
) ;

CREATE TABLE Address (
  id int(11)  NOT NULL,
  address varchar(20),
  country varchar(20),
  PRIMARY KEY (id)
) ;