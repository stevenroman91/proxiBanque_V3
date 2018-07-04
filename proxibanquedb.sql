--
--
--
-- Contenu de la table `conseillerClientele`
--
INSERT INTO `conseillers` (`adresse`,`codePostal`,`login`,`nom`,`password`,`prenom`,`telephone`,`ville`) VALUES
('1 rue de paris', '75000','sroman','ROMAN','123456','Steven','0606060606','Paris'),
('5 rue de paris', '75001','nboutra','BOUTRA','987456','Nadir','0707070707','Paris'),
('10 rue de paris', '75002','cpicard','PICARD','000000','Camille','060607777','Paris');

-- ------------------------------------------------------------

--
-- Contenu de la table `Client`
--

INSERT INTO `clients` (`adresse`,`codePostal`,`nom`,`prenom`,`telephone`,`typeClient`,`ville`) VALUES
('1 rue de paris','75003','SISI', 'Kamir', 0699003214,'particulier','Paris'),
('1 rue de paris','75004','USSUNET', 'Quentin', 0198413564,'entreprise','Paris'),
('1 rue de paris','75005','VALLETE', 'Arnaud', 0611002543,'particulier','Paris'),
('1 rue de paris','75006','LENOIR', 'Fabien', 0714638972,'entreprise','Paris'),
('1 rue de paris','75007','VOLATRON', 'Antoine', 0618192456,'particulier','Paris'),
('1 rue de paris','75008','LLORIS', 'Hugo', 0759856321,'entreprise','Paris'),
('1 rue de paris','75009','POGBA', 'Paul', 0687952514,'particulier','Paris'),
('1 rue de paris','75010','GRIEZMAN', 'Antoine', 0620140103,'entreprise','Paris'),
('1 rue de paris','75011','MENDY', 'Benjamin', 0654796312,'particulier','Paris'),
('1 rue de paris','75012','VARANE', 'Raphael', 0100352000,'particulier','Paris'),
('1 rue de paris','75013','RAMI', 'Adil', 0669845214,'particulier','Paris'),
('1 rue de paris','75014','UMTITI', 'Samuel', 0698741200,'entreprise','Paris'),
('1 rue de paris','75015','FEKIR', 'Nabil', 0741203025,'particulier','Paris'),
('1 rue de paris','75016','MBAPPE', 'Kylian', 0620889944,'entreprise','Paris');


-- -------------------------------------------------------------------------------------------------------

--
-- Contenu de la table `compteCourant`
--

INSERT INTO `comptecourant` (`dateOuvertureCompte`,`decouvert`,`solde`) VALUES
('10/02/2014',2000., 1000.),
('14/06/2017',1500., 750.),
('29/04/2015',1500., 150.),
('15/03/2017',2000., 860.),
('03/09/2012',1500., 786.),
('22/11/2008',1000., 400.),
('12/05/2015',2000., 900.),
('13/10/2000',1000., 700.),
('21/12/2008',1000., 680.),
('10/02/2016',2000., 290.),
('01/07/2001',1000., 740.),
('21/09/2013',1500., 999.);

-- ----------------------------------------------------------------------------------------------------------
--
-- Contenu de la table `compteEpargne`
--

INSERT INTO `compteepargne` (`dateOuvertureCompte`,`solde`,`taux`) VALUES
('10/02/2014',2000., 3.),
('14/06/2017',1500., 3.),
('29/04/2015',1500., 3.),
('15/03/2017',2000., 3.),
('03/09/2012',1500., 3.),
('22/11/2008',1000., 3.),
('12/05/2015',2000., 3.),
('13/10/2000',1000., 3.),
('21/12/2008',1000., 3.),
('10/02/2016',2000., 3.),
('01/07/2001',1000., 3.),
('21/09/2013',1500., 3.);

-- ----------------------------------------------------------------------------------------------------------
--
-- clés etrangers dans client `comptecourant`
--

UPDATE `clients` SET `idCC` = '12' WHERE `clients`.`id` = 1;
UPDATE `clients` SET `idCC` = '11' WHERE `clients`.`id` = 2;
UPDATE `clients` SET `idCC` = '10' WHERE `clients`.`id` = 3;
UPDATE `clients` SET `idCC` = '9' WHERE `clients`.`id` = 4;
UPDATE `clients` SET `idCC` = '8' WHERE `clients`.`id` = 5;
UPDATE `clients` SET `idCC` = '7' WHERE `clients`.`id` = 6;
UPDATE `clients` SET `idCC` = '6' WHERE `clients`.`id` = 7;
UPDATE `clients` SET `idCC` = '5' WHERE `clients`.`id` = 8;
UPDATE `clients` SET `idCC` = '5' WHERE `clients`.`id` = 9;
UPDATE `clients` SET `idCC` = '3' WHERE `clients`.`id` = 10;
UPDATE `clients` SET `idCC` = '2' WHERE `clients`.`id` = 11;
UPDATE `clients` SET `idCC` = '1' WHERE `clients`.`id` = 12;

-- ----------------------------------------------------------------------------------------------------------
--
-- clés etrangers dans client `compteepargne`
--

UPDATE `clients` SET `idCE` = '1' WHERE `clients`.`id` = 14;
UPDATE `clients` SET `idCE` = '2' WHERE `clients`.`id` = 13;
UPDATE `clients` SET `idCE` = '3' WHERE `clients`.`id` = 12;
UPDATE `clients` SET `idCE` = '4' WHERE `clients`.`id` = 11;
UPDATE `clients` SET `idCE` = '5' WHERE `clients`.`id` = 10;
UPDATE `clients` SET `idCE` = '6' WHERE `clients`.`id` = 9;
UPDATE `clients` SET `idCE` = '7' WHERE `clients`.`id` = 8;
UPDATE `clients` SET `idCE` = '8' WHERE `clients`.`id` = 7;
UPDATE `clients` SET `idCE` = '9' WHERE `clients`.`id` = 6;
UPDATE `clients` SET `idCE` = '10' WHERE `clients`.`id` = 5;
UPDATE `clients` SET `idCE` = '11' WHERE `clients`.`id` = 4;
UPDATE `clients` SET `idCE` = '12' WHERE `clients`.`id` = 3;

-- ----------------------------------------------------------------------------------------------------------
--
-- clés etrangers dans client `conseiller`
--

UPDATE `clients` SET `idConseiller` = '1' WHERE `clients`.`id` = 1;
UPDATE `clients` SET `idConseiller` = '1' WHERE `clients`.`id` = 2;
UPDATE `clients` SET `idConseiller` = '1' WHERE `clients`.`id` = 3;
UPDATE `clients` SET `idConseiller` = '1' WHERE `clients`.`id` = 4;
UPDATE `clients` SET `idConseiller` = '1' WHERE `clients`.`id` = 5;
UPDATE `clients` SET `idConseiller` = '1' WHERE `clients`.`id` = 6;
UPDATE `clients` SET `idConseiller` = '2' WHERE `clients`.`id` = 7;
UPDATE `clients` SET `idConseiller` = '2' WHERE `clients`.`id` = 8;
UPDATE `clients` SET `idConseiller` = '2' WHERE `clients`.`id` = 9;
UPDATE `clients` SET `idConseiller` = '2' WHERE `clients`.`id` = 10;
UPDATE `clients` SET `idConseiller` = '2' WHERE `clients`.`id` = 11;
UPDATE `clients` SET `idConseiller` = '3' WHERE `clients`.`id` = 12;
UPDATE `clients` SET `idConseiller` = '3' WHERE `clients`.`id` = 13;
UPDATE `clients` SET `idConseiller` = '3' WHERE `clients`.`id` = 14;

