@deconnexion
Feature: Deconnexion
  ETQ utilisateur je souhaite me deconnecter de l'application Whereit

  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Superviseur"
    And Je saisis le password "WeFind1204%="
    And je clique sur le bouton Valider

  @decnx
  Scenario: Deconnexion
    When je clique sur le bouton logout
    Then je me redirige vers la page de connexion
