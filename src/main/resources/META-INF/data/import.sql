INSERT INTO Unit (nameUnit) VALUES ('Unidade A');
INSERT INTO Unit (nameUnit) VALUES ('Unidade B');
INSERT INTO Unit (nameUnit) VALUES ('Unidade C');
INSERT INTO Unit (nameUnit) VALUES ('Unidade D');
INSERT INTO Unit (nameUnit) VALUES ('Unidade E');
INSERT INTO Unit (nameUnit) VALUES ('Unidade F');
INSERT INTO Unit (nameUnit) VALUES ('Lisboa');
INSERT INTO Unit (nameUnit) VALUES ('Porto');



INSERT INTO Client (nipc, potentialRevenue, name) VALUES (0000001, 100, 'Cliente Um');
INSERT INTO Client (nipc, potentialRevenue, name) VALUES (0000002, 200, 'Cliente Dois');
INSERT INTO Client (nipc, potentialRevenue, name) VALUES (0000003, 300, 'Cliente Tres');
INSERT INTO Client (nipc, potentialRevenue, name) VALUES (0000004, 400, 'Cliente Quatro');
INSERT INTO Client (nipc, potentialRevenue, name) VALUES (0000005, 500, 'Cliente Cinco');



INSERT INTO Person(username, hashcode, salt, name, role) VALUES ('COO', 'ShVOBO+A','7yaYTHQ4RI2Yd3KUwTiMezw3pIKe417EMPU51pGidPefqzs40Cp+1UBPaozGvyFnsmY=', 'SuperUser', 'SuperUser');
INSERT INTO Person(username, hashcode, salt, name, role) VALUES ('managerA', 'tmPfdYmE','hQFcM1z6ld3eYZPGKOFcdBSFNcGezFDonNbI0i3zwj7hJH/pxd6pJ3ZsufbjzRBDHhA=', 'ManagerA', 'manager');
INSERT INTO Person(username, hashcode, salt, name, role) VALUES ('managerB', 'iefgh2K9','RRK8yVxdZeuNzcwFJ1aDteMsbr7KwH9P8J+ng5BXhdgm+7Hj7YmrSwe2UcHLBxw44p8=', 'ManagerB', 'manager');
INSERT INTO Person(username, hashcode, salt, name, role) VALUES ('managerC', 'RdM3ro6P','1KOSGjIv5gfAHy8kjJLP6eNVNoMNoAtciqd/GMTox2nWPgdYRznruGy8bxkQz3TPInY=', 'ManagerC', 'manager');

INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('a@a', '1gfhf', 'Joaquim', 'director', 'salt1' ,'Joaq', 1);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('b@b', '2fghfgh', 'Antonio', 'manager','salt2', 'Anto',2);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('c@c', '3fghfgh', 'Jose', 'manager','salt3','Jose', 3);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('d@d', '4fghff', 'Paulo', 'manager','salt4','Paul', 2);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('e@e', '5gfghf', 'Joao', 'manager' ,'salt5','Joao', 1);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('a@a', '1gfhf', 'Daiana', 'manager', 'salt1' ,'Joaq', 3);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('b@b', '2fghfgh', 'Flavio', 'maganer','salt2', 'Anto',2);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('c@c', '3fghfgh', 'Ana', 'manager','salt3','Jose', 3);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('d@d', '4fghff', 'Amanda', 'manager','salt4','Paul', 2);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('e@e', '5gfghf', 'Pedro', 'manager' ,'salt5','Joao', 1);


INSERT INTO InteractionType(interactionType) VALUES ('Visita');
INSERT INTO InteractionType(interactionType) VALUES ('Contrato');
INSERT INTO InteractionType(interactionType) VALUES ('CV');
INSERT INTO InteractionType(interactionType) VALUES ('Entrevista');
INSERT INTO InteractionType(interactionType) VALUES ('Reunioes Cliente');
INSERT INTO InteractionType(interactionType) VALUES ('Pedido');




INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1', 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1', 2, 2, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2', 2, 2, 2, 2);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('3', 3, 3, 3, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('4', 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('5', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('6', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('7', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('8', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('9', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('10', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('11', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('13', 2, 3, 1, 2);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('3', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('3', 2, 3, 4, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('11', 1, 4, 2, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('21', 2, 3, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1', 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2', 2, 2, 2, 2);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('3', 3, 3, 3, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('4', 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('5', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('6', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('7', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('8', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('9', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('10', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('11', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('13', 2, 3, 1, 2);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('3', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('3', 2, 3, 4, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('11', 1, 4, 2, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('21', 2, 3, 1, 1);