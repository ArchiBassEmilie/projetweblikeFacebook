projetweblikeFacebook
=====================

Présentation
============
Projet scolaire de développement web. L'objectif est de reprendre des fonctionnalités du social Network Facebook.

Nous nous proposons de realiser un blog  sur le même  principe que "Facebook" pour les etudiants de l’ESIEA .

Les fonctionnalités de notre Blog seront les suivantes :
1 - la gestion des utilisateurs 
	1.1 - création du compte utilisateur*
	1.2 - Insertion de la photo du blogueur  (facultative)
2 -  la gestion des articles 	
  2.1 - Ajout/Supression d’articles
  2.2 - Ajout/Suppresion de commentaires
  2.3 - Consultation des anciens commentaires
  2.3 - Ajout du “ like or dislike”(permettra à un blogueur de dire s’il aime ou pas une publication ).
  2.4 - Post de photos par l’utilisateur (fonctionnalité implémentée en fonction de l’avancement).
	
La creation d’un compte utilisateur permettra d’enregistrer les données d’un utilisateur 
de telle sorte qu’il puisse se connecter sur son mur à tout moment.

Pour nous permettre de développer cette page web, nous avons utilisé les technologies suivants:
  -Jsp
  -Java
  -Javascript
  -CSS
  -MySQL
  
Les pré-requis à installer dans la debian
=========================================
  
  Pour exécuter le fichier .war, il est nécessaire d'avoir installer au préalable dans la debian:
  - La version du serveur tomcat 6 (apt-get install tomcat6)
  - La version apache2 (apt-get install apache2)

Procédure d'exécution
======================

1- Récupérer le projetweblikeFacebook sur github
2- Sur votre machine virtuel, connectez-vous en root.
3- Dirigez vous dans le répertoire webapp www d'apache2
4- Déposez le fichier .war dans ce répertoire
3- Ouvrez un navigateur et lancer le lien : localhost:8080/contactAdresse.
