@forgotPassword
Feature: Mot de passe oublié
  ETQ utilisateur je souhaite recuperer mon mot de passe sur l application Whereit

  Background: 
    Given Je me connecte à l'application Whereit-test

  @forgotPw
  Scenario: Mot de passe oublié
    When je saisis l'Identifiant "imen"
    And je clique sur le texte mot de passe oubié?
    And je saisis l'adresse email "imen.benammar@dsi-globalservices.fr"
    And je clique sur le bouton envoyer
  