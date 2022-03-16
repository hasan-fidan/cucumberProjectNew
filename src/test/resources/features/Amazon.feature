Feature: Amazon sayfasina gidilecek


  Scenario: Amazon sayfasinda Java kelimesi arar.
    Given kullanici "amazon" sayfasina gider
    And "Java" kelimesini arar
    Then tarayiciyi kapatir