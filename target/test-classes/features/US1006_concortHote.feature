Feature: US1OO6 Concorthotel
  @CH
  Scenario Outline: TC11 kullanici gecerli bilgilerle giris yapar

    Given kullanici "CHQAUrl" sayfasina gider
    Then CH Log in linkine tiklar
    And CH username kutusuna "<wrongUserName>" girer
    And CH password kutusuna "<wrongPassword>" girer
    And CH Login butonuna basar
    Then  giris yapilamadigini test eder
    And  sayfayi kapatir
    Examples: |wrongUserName| |wrongPassword|

    |Manager6| |Manager6!|
    |Manager8| |Manager8!|
    |Manager9| |Manager9!|
    |Manager5| |Manager5!|