
@recherchePersonnalisee
Feature: Faire une recherche personnalisee
  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Biomed"
    And Je saisis le password "Pssj2021"
    And je clique sur le bouton Valider
    
  @rechPers
  Scenario: RecherchePersonnalisee
    Given Je suis sur la page "Page d’accueil"  
    When Je clique sur le bouton recherche personnalisee
    And Je suis sur la page "Recherche personnalisée"
    And Je choisis un element parmi la famille des equipements "moniteur"
    And Le type equipement moniteur s'affiche automatiquement dans la case type des equipements
    And Je clique sur le bouton suivant
    And Je choisi le batiment B Medecine
    And Je choisi  un etage Med1
    And Le service Med1 apparait automatiquement
    And Je clique sur Rechercher
    Then Je suis sur la page "Recherche personnalisée" 
    
 