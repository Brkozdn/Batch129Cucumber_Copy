package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report_smoke.html",
                  "json:target/json-reports/cucumber.json",
                  "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@java",
        dryRun = false

)



public class TestRunner {

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
