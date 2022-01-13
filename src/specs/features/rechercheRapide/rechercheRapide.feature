@rechercheRapide
Feature: RechercheRapide
  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Biomed"
    And Je saisis le password "Pssj2021"
    And je clique sur le bouton Valider
   

  @rechRinvd
  Scenario Outline: recherche invalide d'un équipement
    Given Je suis sur la page "Page d’accueil"
    When Je saisis la valeur <equipement> dans la barre de recherche
    And Je clique sur le bouton rechercher
    Then Message d'alerte apparait <message>
   

    Examples: 
      | equipement | message                               |
      | ""         | "Veuillez saisir un nom d’équipement" |
      | "999999"   | "Cet équipement n’existe pas"         |

  @rechRvd
  Scenario: recherche valide d'un équipement
    Given Je suis sur la page "Page d’accueil"
    When Je saisis la valeur "4495" dans la barre de recherche
    And Je clique sur le bouton rechercher
    Then Je suis sur la page "Localisation"

