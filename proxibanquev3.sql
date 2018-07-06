-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  jeu. 05 juil. 2018 à 15:48
-- Version du serveur :  10.1.32-MariaDB
-- Version de PHP :  7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `blog`
--

CREATE DATABASE proxibanquev3;
USE proxibanquev3;

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE `adresse` (
  `id` int(11) NOT NULL,
  `adressePrincipale` varchar(255) DEFAULT NULL,
  `adresseSecondaire` varchar(255) DEFAULT NULL,
  `codePostal` varchar(255) DEFAULT NULL,
  `pays` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `adresse`
--

INSERT INTO `adresse` (`id`, `adressePrincipale`, `adresseSecondaire`, `codePostal`, `pays`, `ville`) VALUES
(1, '1 rue Odessa', 'Batiment 1', '75001', 'France', 'Paris'),
(2, '10 rue Odessa', 'Batiment 2', '75002', 'France', 'Paris'),
(3, '15 rue Odessa', 'Batiment 3', '75003', 'France', 'Paris'),
(4, '100 rue Odessa', 'Batiment 4', '75004', 'France', 'Paris'),
(5, '105 rue Odessa', 'Batiment 5', '75005', 'France', 'Paris'),
(6, '110 rue Odessa', 'Batiment 6', '75006', 'France', 'Paris'),
(7, '115 rue Odessa', 'Batiment 7', '75007', 'France', 'Paris'),
(8, '120 rue Odessa', 'Batiment 8', '75008', 'France', 'Paris'),
(9, '125 rue Odessa', 'Batiment 9', '75009', 'France', 'Paris'),
(10, '130 rue Odessa', 'Batiment 10', '75010', 'France', 'Paris'),
(11, '135 rue Odessa', 'Batiment 11', '75011', 'France', 'Paris'),
(12, '140 rue Odessa', 'Batiment 12', '75012', 'France', 'Paris'),
(13, '145 rue Odessa', 'Batiment 13', '75013', 'France', 'Paris'),
(14, '150 rue Odessa', 'Batiment 14', '75014', 'France', 'Paris');

-- --------------------------------------------------------

--
-- Structure de la table `cartebleu`
--

CREATE TABLE `cartebleu` (
  `id` int(11) NOT NULL,
  `dateExpiration` date DEFAULT NULL,
  `numCarte` bigint(20) NOT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `cartebleu`
--

INSERT INTO `cartebleu` (`id`, `dateExpiration`, `numCarte`, `type`) VALUES
(1, '2016-12-16', 699003206990032, 'Visa electron'),
(2, '2020-11-16', 198413506990032, 'Visa premier'),
(3, '2020-10-16', 611002506990032, 'Visa electron'),
(4, '2020-09-16', 714638906990032, 'Visa premier'),
(5, '2020-08-16', 618192406990032, 'Visa electron'),
(6, '2020-07-16', 759856306990032, 'Visa premier'),
(7, '2020-06-16', 687952506990032, 'Visa premier'),
(8, '2020-05-16', 620140106990032, 'Visa premier'),
(9, '2020-04-16', 654796306990032, 'Visa electron'),
(10, '2020-03-16', 100352006990032, 'Visa premier'),
(11, '2020-02-16', 669845206990032, 'Visa premier'),
(12, '2020-01-16', 698741206990032, 'Visa electron'),
(13, '2020-12-10', 741203006990032, 'Visa electron'),
(14, '2020-12-05', 620889906990032, 'Visa electron');

-- --------------------------------------------------------

--
-- Structure de la table `chequier`
--

CREATE TABLE `chequier` (
  `id` int(11) NOT NULL,
  `dateEnvoi` date DEFAULT NULL,
  `dateReception` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `chequier`
--

INSERT INTO `chequier` (`id`, `dateEnvoi`, `dateReception`) VALUES
(1, '2017-12-16', '2018-12-16'),
(2, '2017-11-16', '2018-11-16'),
(3, '2017-10-16', '2018-10-16'),
(4, '2017-09-16', '2018-09-16'),
(5, '2017-08-16', '2018-08-16'),
(6, '2017-07-16', '2018-07-16'),
(7, '2018-06-16', '2018-06-16'),
(8, '2017-05-16', '2018-05-16'),
(9, '2017-04-16', '2018-04-16'),
(10, '2017-03-16', '2018-03-16'),
(11, '2017-02-16', '2018-02-16'),
(12, '2017-01-16', '2018-01-16'),
(13, '2017-12-10', '2018-10-17'),
(14, '2017-12-05', '2018-12-23');

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `dateDeNaissance` date DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `numClient` int(11) NOT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `idAdresse` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `clients`
--

INSERT INTO `clients` (`id`, `dateDeNaissance`, `nom`, `numClient`, `prenom`, `idAdresse`) VALUES
(1, '1991-12-16', 'SISI', 6990032, 'Kamir', 1),
(2, '1991-11-16', 'USSUNET', 1984135, 'Quentin', 2),
(3, '1991-10-16', 'VALLETE', 6110025, 'Arnaud', 3),
(4, '1991-09-16', 'LENOIR', 7146389, 'Fabien', 4),
(5, '1991-08-16', 'VOLATRON', 6181924, 'Antoine', 5),
(6, '1991-07-16', 'LLORIS', 7598563, 'Hugo', 6),
(7, '1991-06-16', 'POGBA', 6879525, 'Paul', 7),
(8, '1991-05-16', 'GRIEZMAN', 6201401, 'Antoine', 8),
(9, '1991-04-16', 'MENDY', 6547963, 'Benjamin', 9),
(10, '1991-03-16', 'VARANE', 1003520, 'Raphael', 10),
(11, '1991-02-16', 'RAMI', 6698452, 'Adil', 11),
(12, '1991-01-16', 'UMTITI', 6987412, 'Samuel', 12),
(13, '1991-12-10', 'FEKIR', 7412030, 'Nabil', 13),
(14, '1991-12-05', 'MBAPPE', 6208899, 'Kylian', 14);

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE `compte` (
  `id` int(11) NOT NULL,
  `dateOuverture` date DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `numCompte` bigint(20) NOT NULL,
  `solde` double NOT NULL,
  `idCarteBleu` int(11) DEFAULT NULL,
  `idChequier` int(11) DEFAULT NULL,
  `idClient` int(11) DEFAULT NULL,
  `typeCompte` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`id`, `dateOuverture`, `libelle`, `numCompte`, `solde`, `idCarteBleu`, `idChequier`, `idClient`,`typeCompte`) VALUES
(1, '2014-02-01', 'particulier', 2000123456123, 1000, 1, 1, 1,'COMPTE_COURANT'),
(2, '2014-06-02', 'professionnel', 1500147852369, 750, null, 14, 1,'COMPTE_EPARGNE'),
(3, '2014-04-03', 'particulier', 1500987456321, 150, null, 13, 1,'COMPTE_EPARGNE'),
(4, '2014-03-04', 'professionnel', 2000159874236, 860, 4, 12, 3,'COMPTE_COURANT'),
(5, '2014-09-05', 'professionnel', 1500153269854, 786, 5, 11, 4,'COMPTE_COURANT'),
(6, '2014-11-06', 'particulier', 1000917456321, 1200, null, 10, 5,'COMPTE_COURANT'),
(7, '2014-05-07', 'particulier', 2000111235666, 1300, null, 9, 6,'COMPTE_COURANT'),
(8, '2014-10-08', 'professionnel', 1000999865532, 700, 13, null, 7,'COMPTE_COURANT'),
(9, '2014-12-09', 'professionnel', 1000789546353, 680, 12, null, 8,'COMPTE_COURANT'),
(10, '2014-02-10', 'particulier', 2000114477852, 290, 11, 6, 9,'COMPTE_COURANT'),
(11, '2014-07-11', 'professionnel', 1000963963123, 740, 10, 5, 10,'COMPTE_COURANT'),
(12, '2014-09-13', 'particulier', 1500951357852, 999, 9, 7, 12,'COMPTE_COURANT');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `cartebleu`
--
ALTER TABLE `cartebleu`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `chequier`
--
ALTER TABLE `chequier`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8a2a6t331kep5h3mn76cn0noi` (`idAdresse`);

--
-- Index pour la table `compte`
--
ALTER TABLE `compte`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKli9unu0qvj3m91u8wkqpsnkhc` (`idCarteBleu`),
  ADD KEY `FKfmjaup0tgvcp8gygyk4h287n8` (`idChequier`),
  ADD KEY `FKbnx42qk6f5xwsgcdd1xabu0jm` (`idClient`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `adresse`
--
ALTER TABLE `adresse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `cartebleu`
--
ALTER TABLE `cartebleu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `chequier`
--
ALTER TABLE `chequier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `compte`
--
ALTER TABLE `compte`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `clients`
--
ALTER TABLE `clients`
  ADD CONSTRAINT `FK8a2a6t331kep5h3mn76cn0noi` FOREIGN KEY (`idAdresse`) REFERENCES `adresse` (`id`);

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `FKbnx42qk6f5xwsgcdd1xabu0jm` FOREIGN KEY (`idClient`) REFERENCES `clients` (`id`),
  ADD CONSTRAINT `FKfmjaup0tgvcp8gygyk4h287n8` FOREIGN KEY (`idChequier`) REFERENCES `chequier` (`id`),
  ADD CONSTRAINT `FKli9unu0qvj3m91u8wkqpsnkhc` FOREIGN KEY (`idCarteBleu`) REFERENCES `cartebleu` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
