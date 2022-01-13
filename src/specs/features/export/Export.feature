@export
Feature: Export des données
  ETQ utilisateur je souhaite exporter mes données

  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Biomed"
    And Je saisis le password "Pssj2021"
    And je clique sur le bouton Valider
    When je clique sur le bouton Menu
    And je clique sur le menu Adminstation

  @tc01
  Scenario: Export des etats des capteurs avec la periode par defaut
    And je clique sur le menu Export
    And je choisis un batiment
    And je clique sur le bouton Exporter
    Then je verifie que le fichier est bien telechargé
    
    @tc02
  Scenario: Export des etats des capteurs avec une periode definie
    And je clique sur le menu Export
    And je choisis un batiment
    And je choisis une date de debut "01/11/2021"
    And je choisis une date de fin "11/11/2021"
    And je clique sur le bouton Exporter
    Then je verifie que le fichier est bien telechargé

  @tc03
  Scenario: Export des status des equipements & champs personnalisé avec la periode par defaut
    And je clique sur le menu Export
    And je coche la case de champs personnalisés
    And je clique sur le bouton Exporter
    Then je verifie que le fichier est bien telechargé

  @tc04
  Scenario: Export des status des equipements avec une periode definie
    And je clique sur le menu Export
    And je choisis une date de debut
    And je choisis une date de fin
    And je clique sur le bouton Exporter
    Then je verifie que le fichier est bien telechargé

  @tc05
  Scenario: Export des champs personnalisé avec la periode par defaut
    And je clique sur le menu Export
    And je decoche la case de status
    And je coche la case de champs personnalisés
    And je clique sur le bouton Exporter des Status des equipements
    Then je verifie que le fichier est bien telechargé

  @tc06
  Scenario: Export des status des equipements & champs personnalisés avec la periode par defaut
    And je clique sur le menu Export
    And je coche la case de champs personnalisés
    And je clique sur le bouton Exporter
    Then je verifie que le fichier est bien telechargé

  @tc07
  Scenario: Export des status des equipements & champs personnalisés avec une periode definie
    And je clique sur le menu Export
    And je coche la case de champs personnalisés
    And je choisis une date de debut
    And je choisis une date de fin
    And je clique sur le bouton Exporter
    Then je verifie que le fichier est bien telechargé
    

  