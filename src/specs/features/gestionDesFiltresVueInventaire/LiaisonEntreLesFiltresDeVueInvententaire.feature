
@invFiltre
Feature: Liaison entre les  filtres de vue invententaire
  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Biomed"
    And Je saisis le password "Pssj2021"
    And je clique sur le bouton Valider
    
  @invFiltreFamTyp
  Scenario Outline: Liaison entre les  filtres familles equipements et types equipements
    Given Je clique sur inventaire du site PSSJ
    Then Je suis sur la page "Liste des équipements" 
    When Je choisie la valeur <familleEquipement> du filtre "equipment_family"
    Then Je vérifie le contenu du filtre <typeEquipement> correspend à la famille d equipement choisie <familleEquipement>
    

    Examples: 
      | familleEquipement | typeEquipement | 
      | "BRANCARDS" | "BMB MEDICAL CARVI, BRANCARDS STRYKER, BRANCARDS TASSERIT, BRANCARDS AGENCINOX, BRANCARDS Proclive - Declive, "|
      | "FAUTEUILS" | "FAUTEUIL ROULANT, " |
      | "MATELAS Anti-Escarres" | "MATELAS STRYKER, MATELAS SYSTAM, MATELAS OBA, MATELAS Winncare Group, " |
      | "MONITEURS"| "MONITEUR, " |
      | "POMPES A DEBIT"  | "AGILIA VP, "                          |
      | "POMPES A DOULEUR" |"HOSPIRA SAPPHIRE, VOLUMAT AGILIA, CADD Solis, " | 
      | "POUSSE-SERINGUES"| "INJECTOMAT Agilia fr, AGILIA SP FR, " | 
      | "TENSIOMETRES" | "TENSIOMETRE, " |
      
      
      
       @invFiltreBatEtag
   Scenario Outline: Liaison entre les  filtres batiments et étages
    Given Je clique sur inventaire du site PSSJ
    Then Je suis sur la page "Liste des équipements" 
    When Je choisie un filtre batiment  <Batiment>
    Then Je vérifie le contenu du filtre <Batiment> correspend aux etages disponibles <Etage>


    Examples: 
      | Batiment              | Etage                             | 
      | "Bâtiment B Médecine" | "RDC, Sous Sol, Med 1, Med 2, Med 3, " |
      | "Bâtiment D St Jean"  | "RDC, Urgences / Endo, R+1, R+2, R+3, "|
      | "Bâtiment E SSR"      | "RDJ, RDC, SSR1, SSR2, "              |
      
      
     