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




INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1990', 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2010', 2, 2, 2, 2);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2020', 3, 3, 3, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2000', 1, 1, 1, 1);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2000', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('2020', 2, 3, 4, 3);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1995', 1, 4, 3, 4);
INSERT INTO Interaction(dateInteraction, client_id, interactionType_id, person_id, unit_id) VALUES ('1996', 2, 3, 4, 3);
