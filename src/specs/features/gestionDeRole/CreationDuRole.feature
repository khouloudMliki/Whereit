@creation-role
Feature: Creation du role
  ETQ utilisateur je souhaite creer un role avec des permissions bien definies

  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Superviseur"
    And Je saisis le password "WeFind1204%="
    And je clique sur le bouton Valider
    When je clique sur le bouton Menu
    And je clique sur le menu Adminstation
    And je clique sur le menu Role 

  @tc01
  Scenario: creation d'un role
    And je clique sur le bouton plus
    And je remplis le champ role "Tester"
    And je remplis le champ description "saisir un texte"
    And je coche la case de Gestion des régions
    And je coche la case de Gestion des sites
    And je coche la case de Gestion des passerelles
    And je coche la case de Gestion des capteurs
    And je coche la case de Gestion des types d’équipements
    And je coche la case de Gestion des équipements
    And je coche la case de Gestion des règles / alertes
    And je coche la case de Gestion de la customisation d'interface
    And je coche la case de Gestion des profils de droit / rôles
    And je coche la case de Gestion des utilisateurs
    And je coche la case de Recherche équipement
    And je coche la case de Localisation équipement
    And je coche la case de Historique équipement
    And je coche la case de Réservation équipement
    And je coche la case de Export de données
    And je coche la case de Tableau de bord
    And je coche la case de Module de gestion de la carte thermique
    And je coche la case de API
    And je clique sur le bouton enregistrer
