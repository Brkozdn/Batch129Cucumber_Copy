

#URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
#
#Username : Admin
#
#Password : admin123
#
#
#
#Giriş sayfasının test senaryolarını ve adımlarını çıkarın (sözlü olarak anlatın)
#Giriş sayfası için selenium ve cucumber araçlarını kullanarak pozitif senaryonun (geçerli kullanıcı adı ve şifre girildiği durum) otomasyon kodunu yazın.
#
#İnterneti (github, chatgpt..vs) kullanabilirsiniz. Driver, RunnerClass gibi standart sınıfları başka projelerden kopyalayıp yapıştırarak kullanabilirsiniz.

  Feature: US1009 Ck Pozitif Test


    Scenario: TC01 demo pozitif login

      Given Kullanici "demoUrl" sayfasinda
      And   Username kutucuguna dogru "username" girilir
      Then  Password kutucuguna dogru "password" girilir
      And   Login butonuna tiklanir
      And   Sayfaya erisilebildigi test edilir
      And   Sayfayi kapatir
