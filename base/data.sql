-- Insertion des marques
INSERT INTO marque (nom_marque) VALUES ('Dell');
INSERT INTO marque (nom_marque) VALUES ('HP');
INSERT INTO marque (nom_marque) VALUES ('Lenovo');

-- Insertion des modeles
INSERT INTO modele (nom_modele, id_marque) VALUES ('XPS 13', 1);
INSERT INTO modele (nom_modele, id_marque) VALUES ('Pavilion 15', 2);
INSERT INTO modele (nom_modele, id_marque) VALUES ('ThinkPad X1', 3);

-- Insertion des types d'ordinateurs
INSERT INTO type_ordinateur (nom_type_ordinateur) VALUES ('Laptop');
INSERT INTO type_ordinateur (nom_type_ordinateur) VALUES ('Desktop');
INSERT INTO type_ordinateur (nom_type_ordinateur) VALUES ('Gamer');
INSERT INTO type_ordinateur (nom_type_ordinateur) VALUES ('Server');


-- Insertion des processeurs
INSERT INTO processeur (nom_processeur) VALUES ('Intel Core i7');
INSERT INTO processeur (nom_processeur) VALUES ('AMD Ryzen 5');
INSERT INTO processeur (nom_processeur) VALUES ('Intel Core i5');

-- Insertion de la RAM
INSERT INTO ram (nombre_ram) VALUES (8);
INSERT INTO ram (nombre_ram) VALUES (16);
INSERT INTO ram (nombre_ram) VALUES (32);

-- Insertion du stockage
INSERT INTO stockage (quantite_stockage, type_stockage) VALUES (256, 'SSD');
INSERT INTO stockage (quantite_stockage, type_stockage) VALUES (512, 'SSD');
INSERT INTO stockage (quantite_stockage, type_stockage) VALUES (1000, 'HDD');

-- Insertion des clients
INSERT INTO client (nom_client, prenom_client, contact) VALUES ('Dupont', 'Pierre', '0123456789');
INSERT INTO client (nom_client, prenom_client, contact) VALUES ('Martin', 'Sophie', '0987654321');
INSERT INTO client (nom_client, prenom_client, contact) VALUES ('Lemoine', 'Jean', '0147852369');

-- Insertion des problemes
INSERT INTO probleme (description_probleme, categorie_probleme) VALUES ('Ecran casse', 'Materiel');
INSERT INTO probleme (description_probleme, categorie_probleme) VALUES ('Probleme de performance', 'Logiciel');
INSERT INTO probleme (description_probleme, categorie_probleme) VALUES ('Batterie defectueuse', 'Materiel');

-- Insertion des techniciens
INSERT INTO technicien (nom_technicien, numero_employe) VALUES ('Bernard', 'T123');
INSERT INTO technicien (nom_technicien, numero_employe) VALUES ('Lemoine', 'T124');
INSERT INTO technicien (nom_technicien, numero_employe) VALUES ('Durand', 'T125');

-- Insertion des ordinateurs
INSERT INTO ordinateur (numero_serie, id_client, id_ram, id_processeur, id_type_ordinateur, id_modele) 
VALUES ('SN123456789', 1, 1, 1, 1, 1);
INSERT INTO ordinateur (numero_serie, id_client, id_ram, id_processeur, id_type_ordinateur, id_modele) 
VALUES ('SN987654321', 2, 2, 2, 1, 2);
INSERT INTO ordinateur (numero_serie, id_client, id_ram, id_processeur, id_type_ordinateur, id_modele) 
VALUES ('SN564738291', 3, 3, 3, 2, 3);

-- Insertion des relations entre ordinateurs et stockage
INSERT INTO ordinateur_stockage (id_ordinateur, id_stockage) VALUES (1, 1);
INSERT INTO ordinateur_stockage (id_ordinateur, id_stockage) VALUES (2, 2);
INSERT INTO ordinateur_stockage (id_ordinateur, id_stockage) VALUES (3, 3);

-- Insertion des relations entre ordinateurs et problemes
INSERT INTO ordinateur_probleme (id_ordinateur, id_probleme) VALUES (1, 1);
INSERT INTO ordinateur_probleme (id_ordinateur, id_probleme) VALUES (2, 2);
INSERT INTO ordinateur_probleme (id_ordinateur, id_probleme) VALUES (3, 3);

-- Insertion des reparations
INSERT INTO reparation (description_solution, date_depot, date_retour, cout_reparation, statut_reparation, id_technicien, id_probleme)
VALUES ('Remplacement de l ecran', '2025-01-10', '2025-01-15', 150.00, 'en cours', 1, 1);
INSERT INTO reparation (description_solution, date_depot, date_retour, cout_reparation, statut_reparation, id_technicien, id_probleme)
VALUES ('Optimisation du systeme', '2025-01-12', '2025-01-18', 100.00, 'en cours', 2, 2);
INSERT INTO reparation (description_solution, date_depot, date_retour, cout_reparation, statut_reparation, id_technicien, id_probleme)
VALUES ('Changement de batterie', '2025-01-13', '2025-01-20', 120.00, 'en cours', 3, 3);