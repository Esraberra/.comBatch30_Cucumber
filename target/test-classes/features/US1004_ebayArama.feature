Feature: US1004 ebay sayfasinda kelime arama
  Scenario: TC08 kullanici bestbuyda istedigi kelimeyi aratip test eder

    Given kullanici "ebayUrl" sayfasina gider
    Then "nutella" icin arama yapar
    And sonucun "nutella" icerdigini test eder
    Then sayfayi kapatir
    #burada tüm stepdefinitionlar tanimli gibi görünse de testimiz calismaz
  #cünkü arama yapar ve sonucu test eder step definitionlari amazon
  #sayfasina göre locate edilmisti bizden yeni s