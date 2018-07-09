========================    ProxiBanque V3   ======================================

   I) Installation : 
      - Creation de la base de donnée proxibanquev3 en utilisant le script "proxibanquev3.sql"
      - Deployer l'application sur un serveur apache tomcat version 8.5 (Lien pour le deploiement -> localhost:port/)
      - Cas d'utilisation a utiliser pour le test : 
        * Nom ou prénom --> SISI
        * date de naissance --> 16-12-1991

   II) Fonctionnalités : 
      - Ecran de verification par "nom", "prenom" et/ou "nom  prenom" et ou "prenom nom"
      - Ecran de verification de la date de naissance 
      - Ecran d'affichage de la liste des comptes + operations sur les comptes
        * Operation de virement
        * operation de retrait 
      - Ecran pour les operations de virement : 
        * Affichage de la liste des comptes 
        * Saisie de l'ID du compte a debiter et du compte a crediter + le montant du viremennt
        * Redirection vers l'ecran d'affichage des comptes afin de constater le bon deroulement de l'operation
      - Ecran pour les operations de retrait 
        * Affichage de la liste des comptes 
        * Selection du type de retrait (Espece, Chequier, carte Bleu)
        
   III) Documentation : 
      - La documentation est disponible dans doc/index.html