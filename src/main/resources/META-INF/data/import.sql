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


INSERT INTO Person(email,username, hashcode, salt, name, role, unit_id) VALUES ('coo@coo.com','COO', 'ShVOBO+A','7yaYTHQ4RI2Yd3KUwTiMezw3pIKe417EMPU51pGidPefqzs40Cp+1UBPaozGvyFnsmY=', 'Jose Cruz', 'SuperUser',7);
INSERT INTO Person(email,username, hashcode, salt, name, role, unit_id) VALUES ('managerA@a.com','managerA', 'tmPfdYmE','hQFcM1z6ld3eYZPGKOFcdBSFNcGezFDonNbI0i3zwj7hJH/pxd6pJ3ZsufbjzRBDHhA=', 'Pedro Beirao', 'manager',7);
INSERT INTO Person(email,username, hashcode, salt, name, role, unit_id) VALUES ('managerB@b.com','managerB', 'iefgh2K9','RRK8yVxdZeuNzcwFJ1aDteMsbr7KwH9P8J+ng5BXhdgm+7Hj7YmrSwe2UcHLBxw44p8=', 'Daniel Tavares', 'manager',8);
INSERT INTO Person(email,username, hashcode, salt, name, role, unit_id) VALUES ('managerC@c.com','managerC', 'RdM3ro6P','1KOSGjIv5gfAHy8kjJLP6eNVNoMNoAtciqd/GMTox2nWPgdYRznruGy8bxkQz3TPInY=', 'Igor Bruneli', 'manager',9);

INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('Joaquim@aubay.com', '1gfhf', 'Joaquim Marques', 'director', 'salt1' ,'Joaq', 1);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('AntonioDuarte@gmail.com', '2fghfgh', 'Antonio Duarte', 'manager','salt2', 'Anto',2);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('Jose76@aubay.com', '3fghfgh', 'Jose Alves', 'manager','salt3','Jose', 3);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('Paulo@hotmail.com', '4fghff', 'Paulo Morim', 'manager','salt4','Paul', 2);
INSERT INTO Person(email, hashcode, name, role, salt, username, unit_id) VALUES ('Joao1984@gmail.com', '5gfghf', 'Joao Martins', 'manager' ,'salt5','Joao', 1);




INSERT INTO InteractionType(interactionType) VALUES ('Visita');
INSERT INTO InteractionType(interactionType) VALUES ('Aprovação');
INSERT INTO InteractionType(interactionType) VALUES ('CV enviado');
INSERT INTO InteractionType(interactionType) VALUES ('Entrevista');
INSERT INTO InteractionType(interactionType) VALUES ('Reunioes Cliente');
INSERT INTO InteractionType(interactionType) VALUES ('Pedido');
INSERT INTO InteractionType(interactionType) VALUES ('Proposta Aceite');
INSERT INTO InteractionType(interactionType) VALUES ('Proposta Recusada');
INSERT INTO InteractionType(interactionType) VALUES ('Saída');
INSERT INTO InteractionType(interactionType) VALUES ('Ponto de situação');
INSERT INTO InteractionType(interactionType) VALUES ('Realocações - Receber');
INSERT INTO InteractionType(interactionType) VALUES ('Realocações - Dar');
INSERT INTO InteractionType(interactionType) VALUES ('Negócio abaixo de 32%');



INSERT INTO Interaction(dateInteraction,potentialRevenue, client_id, interactionType_id, person_id, unit_id) VALUES ('12',null, 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction,potentialRevenue, client_id, interactionType_id, person_id, unit_id) VALUES ('10',null, 2, 2, 2, 2);
INSERT INTO Interaction(dateInteraction,potentialRevenue, client_id, interactionType_id, person_id, unit_id) VALUES ('16',null, 3, 3, 3, 3);
INSERT INTO Interaction(dateInteraction,potentialRevenue, client_id, interactionType_id, person_id, unit_id) VALUES ('26',null, 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction,potentialRevenue, client_id, interactionType_id, person_id, unit_id) VALUES ('30',null, 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction,potentialRevenue, client_id, interactionType_id, person_id, unit_id) VALUES ('8',null, 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction,potentialRevenue, client_id, interactionType_id, person_id, unit_id) VALUES ('5',null, 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction,potentialRevenue, client_id, interactionType_id, person_id, unit_id) VALUES ('36',null, 2, 3, 4, 3);




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
