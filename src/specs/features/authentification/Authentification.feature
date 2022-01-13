

@connexion
Feature: Authentification - Whereit
  ETQ utilisateur je souhaite m'authentifier sur l application Whereit
  Background:
    Given Je me connecte à l'application Whereit-test
    

  @valid-cnx
  Scenario: Authentification - Whereit
    When Je saisis le username "Superviseur"
    And Je saisis le password "WeFind1204%="
    And je clique sur le bouton Valider
    Then Redirection vers le compte admin
    
      @invalid-username-orPassword-OrInvalidUserNameAndPassword
  Scenario Outline: Authentification - Whereit
    When Je saisis le username <userN>
    And Je saisis le password <pwd>
    And je clique sur le bouton Valider
    Then Je verifie le message d'erreur <msgErreur>  
    Examples:  
    
    |userN           |pwd               |msgErreur                              |
    |"InALIDUSERNAME"|"WeFind1204%="    |"Identifiant ou mot de passe incorrect"|
    |"Superviseur"   |"WeFind1204%=--"  |"Identifiant ou mot de passe incorrect"|
    |"Superviseurrr" |"WeFind1204%=--"  |"Identifiant ou mot de passe incorrect"|

  