Feature: US1008 Concort Hotels Login

  @CH
  Scenario Outline: TC10 Farkli kullanici isimleri ile negative test

    Given kullanici "CHQAUrl" sayfasina gider
    Then CH login linkine tiklar
    And CH username kutusuna "<wrongUserName>" yazar
    And CH password kutusuna "<wrongPassword>" yazar
    And CH login butonuna basar
    Then giris yapilamadigini test eder
    And sayfayi kapatir



    Examples:
      |wrongUserName|wrongPassword|
      |Manager5     |	Manager5!   |
      |Manager6     |	Manager6!   |
      |Manager7     |	Manager7!   |
      |Manager8     |	Manager8!   |
      |Manager9     |	Manager9!   |