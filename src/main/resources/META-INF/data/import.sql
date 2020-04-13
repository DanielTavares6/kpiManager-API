INSERT INTO Unit (nameUnit) VALUES ('Unidade A');
INSERT INTO Unit (nameUnit) VALUES ('Unidade B');
INSERT INTO Unit (nameUnit) VALUES ('Unidade C');
INSERT INTO Unit (nameUnit) VALUES ('Unidade D');
INSERT INTO Unit (nameUnit) VALUES ('Unidade E');
INSERT INTO Unit (nameUnit) VALUES ('Unidade F');
INSERT INTO Unit (nameUnit) VALUES ('Lisboa');
INSERT INTO Unit (nameUnit) VALUES ('Porto');
INSERT INTO Unit (nameUnit) VALUES ('Faro');

INSERT INTO Client (nipc, potentialRevenue, name) VALUES (501591109, 100, 'Continente');
INSERT INTO Client (nipc, potentialRevenue, name) VALUES (501199993, 200, 'Microsoft');
INSERT INTO Client (nipc, potentialRevenue, name) VALUES (508141966, 300, 'Apple');
INSERT INTO Client (nipc, potentialRevenue, name) VALUES (505350173, 400, 'Visionbox');
INSERT INTO Client (nipc, potentialRevenue, name) VALUES (509815316, 500, 'HRB');


INSERT INTO Person(email,username, hashcode, salt, name, role, unit_id) VALUES ('coo@coo.com','COO', 'ShVOBO+A','7yaYTHQ4RI2Yd3KUwTiMezw3pIKe417EMPU51pGidPefqzs40Cp+1UBPaozGvyFnsmY=', 'SuperUser', 'SuperUser',7);
INSERT INTO Person(email,username, hashcode, salt, name, role, unit_id) VALUES ('managerA@a.com','managerA', 'tmPfdYmE','hQFcM1z6ld3eYZPGKOFcdBSFNcGezFDonNbI0i3zwj7hJH/pxd6pJ3ZsufbjzRBDHhA=', 'ManagerA', 'manager',7);
INSERT INTO Person(email,username, hashcode, salt, name, role, unit_id) VALUES ('managerB@b.com','managerB', 'iefgh2K9','RRK8yVxdZeuNzcwFJ1aDteMsbr7KwH9P8J+ng5BXhdgm+7Hj7YmrSwe2UcHLBxw44p8=', 'ManagerB', 'manager',8);
INSERT INTO Person(email,username, hashcode, salt, name, role, unit_id) VALUES ('managerC@c.com','managerC', 'RdM3ro6P','1KOSGjIv5gfAHy8kjJLP6eNVNoMNoAtciqd/GMTox2nWPgdYRznruGy8bxkQz3TPInY=', 'ManagerC', 'manager',9);

INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('Joaquim@aubay.com', '1gfhf', 'Joaquim Marques', 'director', 'salt1' ,'Joaq', 1);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('AntonioDuarte@gmail.com', '2fghfgh', 'Antonio Duarte', 'manager','salt2', 'Anto',2);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('Jose76@aubay.com', '3fghfgh', 'Jose Alves', 'manager','salt3','Jose', 3);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('Paulo@hotmail.com', '4fghff', 'Paulo Morim', 'manager','salt4','Paul', 2);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('Joao1984@gmail.com', '5gfghf', 'Joao Martins', 'manager' ,'salt5','Joao', 1);





INSERT INTO InteractionType(interactionType) VALUES ('Visita');
INSERT INTO InteractionType(interactionType) VALUES ('Contrato');
INSERT INTO InteractionType(interactionType) VALUES ('CV');
INSERT INTO InteractionType(interactionType) VALUES ('Entrevista');
INSERT INTO InteractionType(interactionType) VALUES ('Reunioes Cliente');
INSERT INTO InteractionType(interactionType) VALUES ('Pedido');




INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1990', 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2010', 2, 2, 2, 2);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2020', 3, 3, 3, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2000', 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2000', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2020', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1995', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1996', 2, 3, 4, 3);
