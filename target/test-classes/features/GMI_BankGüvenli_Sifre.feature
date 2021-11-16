Feature: GMI BANK GÜVENLI SIFRE
  Background:
    Given kullanici gmibank sayfasina gider
    Then gmibank giris butonuna tiklar
    Then gmibank register butonuna tiklar
    Then gmibank password kutusuna tiklar

    Scenario Outline: Password Red Test
      Given "<password>" girer
      Then   gmibank Password strength red görünür

      Examples:
      |password|
      |    1111|
      |    AAA|
