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


  Scenario Outline: Password Orange Test
    Given "<passwordOrange>" girer
    Then   gmibank Password strength orange görünür

    Examples:
      |passwordOrange|
      |   AA11|
      |    AA22|


  Scenario Outline: Password Yellow Test
    Given "<passwordYellow>" girer
    Then   gmibank Password strength yellow görünür

    Examples:
      |passwordYellow|
      |   aaAA11|
      |    bbAA22|


  Scenario Outline: Password LightGreen Test
    Given "<passwordLightGreen>" girer
    Then   gmibank Password strength lightgreen görünür

    Examples:
      |passwordLightGreen|
      | 1Aa+|
      |    1Bl+|
  Scenario Outline: Password Green Test
    Given "<passwordGreen>" girer
    Then   gmibank Password strength green görünür

    Examples:
      |passwordGreen|
      | 1Aa+A!a|
      |    1Bl+B!b|
