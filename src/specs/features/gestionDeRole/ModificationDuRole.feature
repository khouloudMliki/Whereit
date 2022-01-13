@modification-role
Feature: Modification du role
  ETQ utilisateur je souhaite les permissions d'un role

  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Superviseur"
    And Je saisis le password "WeFind1204%="
    And je clique sur le bouton Valider
    When je clique sur le bouton Menu
    And je clique sur le menu Adminstation
    And je clique sur le menu Role 

  @tc01
  Scenario: Modification du role