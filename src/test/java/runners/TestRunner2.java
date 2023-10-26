package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //NOTASYONU Runner CLASS'INA CALISMA ÖZELLİGİ KATAR
// BU NOTASYON OLDUGU İCİN CUCUMBER FRAMEWORK'UMUZDE Junit KULLANMAYI TERCİH EDİYORUZ


@CucumberOptions(

        plugin = {"pretty", // KONSOLDA SENARYOLAR İLE İLGİLİ AYRINTILI BİLGİ VERİR
                "html:target/default-cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},
        features = "src/test/resources/features", //FEATURE DOSYALARINI NEREDEN BULACAGINI TARİF EDER
        glue = "stepDefinitions", //STEP DEFİNİTİONS DOSYALARINI NEREDEN BULACAGINI TARİF EDER
        tags = "@a3", // HANGİ TAG'I CALISTIRMAK İSTİYORSAK O YAZILIR
        dryRun = false, // True SECİLİRSE TESTİ CALISTIRMADAN SADECE EKSİK ADIMLARI BİZE VERİR
        monochrome = false // True SECİLİRSE KONSOLDAKİ CIKTILARI SİYAH VERİR

)



public class TestRunner2 {

    /*
    BİR FARAMEWORK'DE BİR TEK Runner CLASS'I YETERLİ OLABİLİR

    Runner CLASS'INDA CLASS BODY'SİNDE HİCBİRSEY OLMAZ
    Runner CLASS'IMIZI ONEMLİ YAPAN 2 ADET ANNOTAİON VARDIR

    @RunWith(Cucumber.class) NOTASYONU Runner CLASS'INA CALISMA ÖZELLİGİ KATAR
    BU NOTASYON OLDUGU İCİN CUCUMBER FRAMEWORK'UMUZDE Junit KULLANMAYI TERCİH EDİYORUZ

    feature: RUNNER DOSYASININ FEATURE DOSYALARINI NEREDEN BULACAGINI TARİF EDER
    glue: STEP DEFİNİTİONS DOSYALARINI NEREDE BULACAGIMIZI GOSTERİR
    tags: O AN HANGİ TAG'I CALISTIRMAK İSTİYORSAK ONU BELLİ EDER

    dryRun: İKİ SECENEK VAR
    dryRun=true; TESTİ CALISTIRMADAN SADECE EKSİK ADIMLARI BİZE VERİR
    dryRun=False; TESTİ CALISTIRIR

     */




}
