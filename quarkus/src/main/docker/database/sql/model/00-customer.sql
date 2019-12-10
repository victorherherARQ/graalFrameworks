SET SQL_LOG_BIN=0;
SET @@SESSION.UNIQUE_CHECKS=0;
SET @@SESSION.FOREIGN_KEY_CHECKS=0;
SET @@SESSION.SQL_MODE='NO_ENGINE_SUBSTITUTION,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `db` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;

GRANT Alter routine ON `db`.* TO 'root'@'localhost' ;
GRANT Create routine ON `db`.* TO 'root'@'localhost' ;
GRANT Create temporary tables ON `db`.* TO 'root'@'localhost' ;
GRANT Execute ON `db`.* TO 'root'@'localhost' ;
GRANT Lock tables ON `db`.* TO 'root'@'localhost' ;
GRANT Alter ON `db`.* TO 'root'@'localhost' ;
GRANT Create ON `db`.* TO 'root'@'localhost' ;
GRANT Create view ON `db`.* TO 'root'@'localhost' ;
GRANT Delete ON `db`.* TO 'root'@'localhost' ;
GRANT Drop ON `db`.* TO 'root'@'localhost' ;
GRANT Grant option ON `db`.* TO 'root'@'localhost' ;
GRANT Index ON `db`.* TO 'root'@'localhost' ;
GRANT Insert ON `db`.* TO 'root'@'localhost' ;
GRANT References ON `db`.* TO 'root'@'localhost' ;
GRANT Select ON `db`.* TO 'root'@'localhost' ;
GRANT Show view ON `db`.* TO 'root'@'localhost' ;
GRANT Trigger ON `db`.* TO 'root'@'localhost' ;
GRANT Update ON `db`.* TO 'root'@'localhost' ;
FLUSH PRIVILEGES ;


--
-- Not dumping tablespaces as no INFORMATION_SCHEMA.FILES table on this server
--

-- ------------------------------------------------------
--  DDL for Table CUSTOMER
-- ------------------------------------------------------
create table db.customer
(
-- Es un valor que se genera de forma automática y que identifica de forma unica al cliente. No se puede modificar y será la clave foránea en otras tablas para identificar al cliente.
-- Se debe corresponder con el Id de usuario web actual de Hybris que identifica a un cliente y en la migración será ese valor.
	id int(10) not null auto_increment comment 'Id de customer', 
	email varchar(128) not null comment 'email que sirve para identificarse y para enviarle notificaciones',
	signup_date timestamp comment 'Fecha de alta del cliente',	
	constraint customer_pk primary key (id)
);

-- ------------------------------------------------------
-- Indexes for Table CUSTOMER
-- ------------------------------------------------------
-- Indice necesario para establecer la FK entre customer4legalconditions y customer.
-- Se incluye el pais porque forma parte de la pk de legal_conditions y así evitamos incongruencias en
-- la relación.
-- create unique index customer_idx_01 on customer(id, system_country_id);


-- ------------------------------------------------------
--  Comments for Table CUSTOMER
-- ------------------------------------------------------
alter table db.customer comment 'Tabla de clientes';
-- ------------------------------------------------------
--  End of DDL for Table CUSTOMER
-- ------------------------------------------------------
INSERT INTO db.customer values("1","victor@gmail.com",NULL);
