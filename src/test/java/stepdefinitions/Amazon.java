package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Amazon {

    AmazonPage amazon = new AmazonPage();


    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @And("{string} kelimesini arar")
    public void kelimesiniArar(String arg0) {
    }

    @Then("tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
    }
}
