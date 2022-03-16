Feature: Amazon sayfasina gidilecek

@smoke
  Scenario Outline: Amazon sayfasinda kelimeleri arar.
    Given kullanici "amazon" sayfasina gider
    And "<masa>" kelimesini arar
    When tarayiciyi kapatir



    Examples:
      |masa  |
      |java  |
      |masa  |
      |kasa  |












