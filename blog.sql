-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mer. 04 juil. 2018 à 14:27
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

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `codePostal` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `typeClient` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  `idCC` int(11) DEFAULT NULL,
  `idCE` int(11) DEFAULT NULL,
  `idConseiller` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `clients`
--

INSERT INTO `clients` (`id`, `adresse`, `codePostal`, `nom`, `prenom`, `telephone`, `typeClient`, `ville`, `idCC`, `idCE`, `idConseiller`) VALUES
(1, '1 rue de paris', '75003', 'SISI', 'Kamir', '699003214', 'particulier', 'Paris', 12, NULL, 1),
(2, '1 rue de paris', '75004', 'USSUNET', 'Quentin', '198413564', 'entreprise', 'Paris', 11, NULL, 1),
(3, '1 rue de paris', '75005', 'VALLETE', 'Arnaud', '611002543', 'particulier', 'Paris', 10, 12, 1),
(4, '1 rue de paris', '75006', 'LENOIR', 'Fabien', '714638972', 'entreprise', 'Paris', 9, 11, 1),
(5, '1 rue de paris', '75007', 'VOLATRON', 'Antoine', '618192456', 'particulier', 'Paris', 8, 10, 1),
(6, '1 rue de paris', '75008', 'LLORIS', 'Hugo', '759856321', 'entreprise', 'Paris', 7, 9, 1),
(7, '1 rue de paris', '75009', 'POGBA', 'Paul', '687952514', 'particulier', 'Paris', 6, 8, 2),
(8, '1 rue de paris', '75010', 'GRIEZMAN', 'Antoine', '620140103', 'entreprise', 'Paris', 5, 7, 2),
(9, '1 rue de paris', '75011', 'MENDY', 'Benjamin', '654796312', 'particulier', 'Paris', 5, 6, 2),
(10, '1 rue de paris', '75012', 'VARANE', 'Raphael', '100352000', 'particulier', 'Paris', 3, 5, 2),
(11, '1 rue de paris', '75013', 'RAMI', 'Adil', '669845214', 'particulier', 'Paris', 2, 4, 2),
(12, '1 rue de paris', '75014', 'UMTITI', 'Samuel', '698741200', 'entreprise', 'Paris', 1, 3, 3),
(13, '1 rue de paris', '75015', 'FEKIR', 'Nabil', '741203025', 'particulier', 'Paris', NULL, 2, 3),
(14, '1 rue de paris', '75016', 'MBAPPE', 'Kylian', '620889944', 'entreprise', 'Paris', NULL, 1, 3);

-- --------------------------------------------------------

--
-- Structure de la table `comptecourant`
--

CREATE TABLE `comptecourant` (
  `id` int(11) NOT NULL,
  `dateOuverture` varchar(255) DEFAULT NULL,
  `decouvert` double NOT NULL,
  `solde` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `comptecourant`
--

INSERT INTO `comptecourant` (`id`, `dateOuverture`, `decouvert`, `solde`) VALUES
(1, '10/02/2014', 2000, 1000),
(2, '14/06/2017', 1500, 750),
(3, '29/04/2015', 1500, 150),
(4, '15/03/2017', 2000, 860),
(5, '03/09/2012', 1500, 786),
(6, '22/11/2008', 1000, 400),
(7, '12/05/2015', 2000, 900),
(8, '13/10/2000', 1000, 700),
(9, '21/12/2008', 1000, 680),
(10, '10/02/2016', 2000, 290),
(11, '01/07/2001', 1000, 740),
(12, '21/09/2013', 1500, 999);

-- --------------------------------------------------------

--
-- Structure de la table `compteepargne`
--

CREATE TABLE `compteepargne` (
  `id` int(11) NOT NULL,
  `dateOuverture` varchar(255) DEFAULT NULL,
  `solde` double NOT NULL,
  `taux` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `compteepargne`
--

INSERT INTO `compteepargne` (`id`, `dateOuverture`, `solde`, `taux`) VALUES
(1, '10/02/2014', 2000, 3),
(2, '14/06/2017', 1500, 3),
(3, '29/04/2015', 1500, 3),
(4, '15/03/2017', 2000, 3),
(5, '03/09/2012', 1500, 3),
(6, '22/11/2008', 1000, 3),
(7, '12/05/2015', 2000, 3),
(8, '13/10/2000', 1000, 3),
(9, '21/12/2008', 1000, 3),
(10, '10/02/2016', 2000, 3),
(11, '01/07/2001', 1000, 3),
(12, '21/09/2013', 1500, 3);

-- --------------------------------------------------------

--
-- Structure de la table `conseillers`
--

CREATE TABLE `conseillers` (
  `id` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `codePostal` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `conseillers`
--

INSERT INTO `conseillers` (`id`, `adresse`, `codePostal`, `login`, `nom`, `password`, `prenom`, `telephone`, `ville`) VALUES
(1, '1 rue de paris', '75000', 'sroman', 'ROMAN', '123456', 'Steven', '0606060606', 'Paris'),
(2, '5 rue de paris', '75001', 'nboutra', 'BOUTRA', '987456', 'Nadir', '0707070707', 'Paris'),
(3, '10 rue de paris', '75002', 'cpicard', 'PICARD', '000000', 'Camille', '060607777', 'Paris');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKkoq56y7grx3rljkrktjopisba` (`idCC`),
  ADD KEY `FK3gqfif0kk0cb0qwfi600r0b3h` (`idCE`),
  ADD KEY `FKkswoi04pxbp7m4plprrwrko02` (`idConseiller`);

--
-- Index pour la table `comptecourant`
--
ALTER TABLE `comptecourant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `compteepargne`
--
ALTER TABLE `compteepargne`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `conseillers`
--
ALTER TABLE `conseillers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `comptecourant`
--
ALTER TABLE `comptecourant`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `compteepargne`
--
ALTER TABLE `compteepargne`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `conseillers`
--
ALTER TABLE `conseillers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `clients`
--
ALTER TABLE `clients`
  ADD CONSTRAINT `FK3gqfif0kk0cb0qwfi600r0b3h` FOREIGN KEY (`idCE`) REFERENCES `compteepargne` (`id`),
  ADD CONSTRAINT `FKkoq56y7grx3rljkrktjopisba` FOREIGN KEY (`idCC`) REFERENCES `comptecourant` (`id`),
  ADD CONSTRAINT `FKkswoi04pxbp7m4plprrwrko02` FOREIGN KEY (`idConseiller`) REFERENCES `conseillers` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
