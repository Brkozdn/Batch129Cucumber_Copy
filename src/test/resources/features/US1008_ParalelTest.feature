  # uc Scenario olusturunuz

  # kullanici amazon anasayfasinda
  # kullanici Nutella icin arama yapar
  # sonuclarin Nutella icerdigini test eder
  # Sayfayi kapatir

  # kullanici amazon anasayfasinda
  # kullanici Java icin arama yapar
  # sonuclarin Java icerdigini test eder
  # Sayfayi kapatir

  # kullanici amazon anasayfasinda
  # kullanici iphone icin arama yapar
  # sonuclarin iphone icerdigini test eder
  # Sayfayi kapatir



@fat
  Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar





    @a1
    Scenario: TC01 kullanici amazonda Nutella aratir

      Given kullanici amazon anasayfasinda
      Then kullanici Nutella icin arama yapar
      And sonuclarin Nutella icerdigini test eder
      And Sayfayi kapatir





    Scenario: TC02 kullanici amazonda Java aratir

      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And Sayfayi kapatir





    @a3
    Scenario: TC03 kullanici iphone aratir

      Given kullanici amazon anasayfasinda
      Then kullanici iphone icin arama yapar
      And sonuclarin iphone icerdigini test eder
      And Sayfayi kapatir