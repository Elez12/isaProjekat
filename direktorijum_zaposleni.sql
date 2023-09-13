CREATE DATABASE  IF NOT EXISTS `direktorijum_zaposleni`;
USE `direktorijum_zaposleni`;

DROP TABLE IF EXISTS `zaposlen`;

CREATE TABLE `zaposlen` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ime` varchar(45) DEFAULT NULL,
  `prezime` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `zaposlen` VALUES 
	(1,'Vuk','Vukovic','vukv@gmail.com'),
	(2,'Ivan','Ivanovic','ivani@gmail.com'),
	(3,'Jovan','Jovanovic','jovanj@gmail.com'),
	(4,'Stefan','Stefanovic','stefans@gmail.com'),
	(5,'Luka','Lukic','luka@gmail.com');

