Feature: US1005 amazonda liste ile ara
  Scenario Outline: TC09 amazonda verilen bir listeyi aratip, var olduklarini test ediniz
    Given kullanici "amazonUrl" sayfasina gider
    Then "<arananÜrün>" icin arama yapar
    And sonucun "<arananÜrün>" icerdigini test eder
    Then sayfayi kapatir

    Examples:
    |arananÜrün|
    |  nutella |
    |  java |
    |  ipod |
    |  armut |