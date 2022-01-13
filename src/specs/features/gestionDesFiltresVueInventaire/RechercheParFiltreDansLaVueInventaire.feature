@rechFilt
Feature: Recherche par filtre dans la vue inventaire
  Background: 
    Given Je me connecte à l'application Whereit-test
    When Je saisis le username "Biomed"
    And Je saisis le password "Pssj2021"
    And je clique sur le bouton Valider
    And Je clique sur inventaire du site PSSJ
    Then Je suis sur la page "Liste des équipements" 
      
       @rechFilBat
   Scenario Outline: Recherche par filtre batiment   
    When Je choisie l'option <Option> du filtre "building"
    Then Je vérifie le contenu de la colonne "Bâtiment" selon le filtre <Option>
    

    Examples: 
      | Option                |    
      | "Bâtiment B Médecine" | 
      | "Bâtiment D St Jean"  |
      | "Bâtiment E SSR"      |   
      
      
      @rechFilFamEqp
   Scenario Outline: Recherche par filtre type equipement
    When Je choisie l'option <Option> du filtre "equipment_family"
    Then Je vérifie les valeurs de la colonne "Type d'équipement" appartiennent <typesAssocies> 
 
    Examples: 
     | Option                   |       typesAssocies                                                  |
     |"POUSSE-SERINGUES"        |"AGILIA SP FR,INJECTOMAT Agilia fr"                                   |
     |"POMPES A DEBIT"          |"AGILIA VP"                                                           |
     |"BRANCARDS"               |"BMB MEDICAL CARVI, BRANCARDS AGENCINOX, BRANCARDS Proclive - Declive, BRANCARDS STRYKER, BRANCARDS TASSERIT"|
     |"POMPES A DOULEUR"        |"CADD Solis, HOSPIRA SAPPHIRE, VOLUMAT AGILIA"                        |
     |"FAUTEUILS"               |"FAUTEUIL ROULANT"                                                    |
     |"MATELAS Anti-Escarres"   |"MATELAS OBA, MATELAS STRYKER, MATELAS SYSTAM, MATELAS Winncare Group"|
     |"MONITEURS"               |"MONITEUR"                                                            |
     |"TENSIOMETRES"            |"TENSIOMETRE"                                                         |
     
            
     
      
      @rechFilTypeEqp
   Scenario Outline: Recherche par filtre type equipement
    When Je choisie l'option <Option> du filtre "equipment_kind"
    Then Je vérifie le contenu de la colonne "Type d'équipement" selon le filtre <Option>
    Examples: 
     | Option                       | 
     |"MONITEUR"                    |
     |"TENSIOMETRE"                 |
     |"HOSPIRA SAPPHIRE"            |
     |"VOLUMAT AGILIA"              |
     |"CADD Solis"                  |
     |"INJECTOMAT Agilia fr"        |
     |"AGILIA SP FR"                |
     |"MATELAS STRYKER"             |
     |"MATELAS SYSTAM"              |
     |"MATELAS OBA"                 |
     |"MATELAS Winncare Group"      |
     |"BMB MEDICAL CARVI"           | 
     |"BRANCARDS STRYKER"           |
     |"BRANCARDS TASSERIT"          |
     |"BRANCARDS AGENCINOX"         |
     |"BRANCARDS Proclive - Declive"|
     |"FAUTEUIL ROULANT"            |
     |"AGILIA VP"                   |
   
      
      
       @rechFilEqpSatuts
   Scenario Outline: Recherche par filtre état équipement
   When Je choisie l'option <Option> du filtre "equipment_status"
   Then Je vérifie le contenu de la colonne "État équipement" selon le filtre <Option>

    Examples: 
     | Option         | 
     |"Disponible"    |
     |"Utilisé"       |
     |"Hors site"     |
     |"Réservé"       |
     |"En transit"    |
     |"En maintenance"|
      
       @InvRechParNom
    Scenario: Recherche valide d un équipement par nom
    When Je cherche equipement par nom "4495" dans la colonne "Équipement"
    
 