package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ConcortHotelStepDefinition {

    ConcortHotelPage qaPage=new ConcortHotelPage();



    @Then("CH login linkine tiklar")
    public void ch_login_linkine_tiklar() {
       qaPage.loginLinki.click();
    }
    @Then("CH username kutusuna {string} yazar")
    public void ch_username_kutusuna_yazar(String kullaniciAdi) {
        qaPage.usernameKutusu.sendKeys(kullaniciAdi);

    }
    @Then("CH password kutusuna {string} yazar")
    public void ch_password_kutusuna_yazar(String sifre) {
        qaPage.passwordKutusu.sendKeys(sifre);
    }
    @Then("CH login butonuna basar")
    public void ch_login_butonuna_basar() {
        qaPage.loginButonu.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qaPage.girisYapilamadiYazisiElementi.isDisplayed());


    }


}
