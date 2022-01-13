
@MursDesRaccourcis
Feature: Je verifie le nombre et la nature des equipements libres

  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Biomed"
    And Je saisis le password "Pssj2021"
    And je clique sur le bouton Valider
    Then Je suis sur la page "Page d’accueil"  
    And Je clique sur site PSSJ
    
    
  @MR1
  Scenario: Choisir la famille des équipements MONITEURS
    When Je clique sur famille equipement "MONITEURS" 
    Then Je verifie le nombre des equipements libres et la nature des equipements affiches "MONITEUR"
  
    
 
  @MR2
  Scenario Outline: Choisir la famille des équipements BRANCARDS
    Then Je clique sur famille equipement "BRANCARDS"
    Then Je verifie le nombre des equipements libres et la nature des equipements affiches <typeEquipement>
    
    Examples: 
      | typeEquipement               |
      |"BRANCARDS STRYKER"           |
      |"BRANCARDS AGENCINOX"         |
      |"BRANCARDS Proclive - Declive"|
     
    
  @MR3
  Scenario: Choisir la famille des équipements FAUTEUILS
    Then Je clique sur famille equipement "FAUTEUILS" 
    Then Je verifie le nombre des equipements libres et la nature des equipements affiches "FAUTEUIL ROULANT"

    
  @MR4
  Scenario Outline: Choisir la famille des équipements MATELAS Anti-Escarres
    Then Je clique sur famille equipement "MATELAS Anti-Escarres"
    Then Je verifie le nombre des equipements libres et la nature des equipements affiches <typeEquipement>

    
    Examples:
    
      |typeEquipement          |
      |"MATELAS SYSTAM"        |
      |"MATELAS STRYKER"       |
      |"MATELAS OBA"           |
      |"MATELAS Winncare Group"|
 
     
    
    
  @MR5
  Scenario: Choisir la famille des équipements POMPES A DEBIT
    Then Je clique sur famille equipement "POMPES A DEBIT"
    Then Je verifie le nombre des equipements libres et la nature des equipements affiches "AGILIA VP"
 
    
  @MR6
  Scenario Outline: Choisir la famille des équipements POMPES A DOULEUR
    Then Je clique sur famille equipement "POMPES A DOULEUR"
    Then Je verifie le nombre des equipements libres et la nature des equipements affiches <typeEquipement>
    
    
    Examples:
    
      |typeEquipement     |
      |"HOSPIRA SAPPHIRE "|
      |"CADD Solis "      |
      |"VOLUMAT AGILIA"   |
      

      
   @MR7
  Scenario Outline: Choisir la famille des équipements POUSSE-SERINGUES
    Then Je clique sur famille equipement "POUSSE-SERINGUES"
    Then Je verifie le nombre des equipements libres et la nature des equipements affiches <typeEquipement>
  
    
    Examples:
    |typeEquipement         |
    |"INJECTOMAT Agilia fr" |
    |"AGILIA SP FR"         |

    
   @MR8
  Scenario: Choisir la famille des équipements TENSIOMETRES
    Then Je clique sur famille equipement "TENSIOMETRES" 
    Then Je verifie le nombre des equipements libres et la nature des equipements affiches "TENSIOMETRE "  

     
    


