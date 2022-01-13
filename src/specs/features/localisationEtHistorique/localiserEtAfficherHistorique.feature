
@inventaire
Feature: Localisation d'un equipement a partir de l'inventaire et affichage de l'historique
  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Biomed"
    And Je saisis le password "Pssj2021"
    And je clique sur le bouton Valider

  @inv1
  Scenario: Localisation et historique d'un equipement
    Given Je suis sur la page "Page d’accueil"
    And Je clique sur PSSJ
    And Je clique sur inventaire
    And Je localise l'equipement "4495"
    Then Je suis sur la page "Localisation" 
    And Je clique sur retour et afficher historique
    Then Je suis sur la page "Historique" 
    

