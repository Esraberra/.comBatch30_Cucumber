Feature:US1007_kullanici_data_ ekleyebilmeli
Scenario Outline: Editor sayfasina farkli kisiler ekleme
 # DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun ve 5 farkli kayit ekleyin
  Given kullanici "editorURL" sayfasina gider

  Then new butonuna basar

  And editör firstname kutusuna "<firstName>" bilgileri girer
  And editör lastname kutusuna "<lastName>" bilgileri girer
  And editör position kutusuna "<position>" bilgileri girer
  And editör office kutusuna "<office>" bilgileri girer
  And editör extension kutusuna "<extension>" bilgileri girer
  And editör startdate kutusuna "<startDate>" bilgileri girer
  And editör salary kutusuna "<salary>" bilgileri girer

  And Create tusuna basar


  Examples:
  |firstName| lastName|    position|     office|        extension|        startDate    |      |salary|
  | Esra    | Kücük |   TestLead   | Münih  |124    |   12.01.2021   | |60000|