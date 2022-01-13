@multi-user-authentification
Feature: Authentification Multiple users - Whereit
  ETQ utilisateur je souhaite m'authentifier sur l'application Whereit avec plusieurs profils

  Background: 
    Given Je me connecte à l'application Whereit-test

  @outline-cnx
  Scenario Outline: multi-role scenario
    When je saisis l'identifiant "<username>"
    And je saisis le mot de passe "<password>"
    And je clique sur le bouton Valider
    And je clique sur l'icone profile
    Then je verifie le role du profile connecté "<userRole>"

    Examples: 
      | username    | password     | userRole  |
      | Superviseur | WeFind1204%= | Installer |
      | Imen        | Imen@2021    | User      |
