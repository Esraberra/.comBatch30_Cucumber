package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_3001_Page;

public class US_3001_StepDefinitions {

    US_3001_Page us_3001_page=new US_3001_Page();

    @Then("gmibank giris butonuna tiklar")
    public void gmibankGirisButonunaTiklar() {
        us_3001_page.ilkGirisButonu.click();
    }

    @Then("gmibank register butonuna tiklar")
    public void gmibankRegisterButonunaTiklar() {
        us_3001_page.registerButonu.click();
    }

    @And("gmibank password kutusuna tiklar")
    public void gmibankPasswordKutusunaTiklar() {
        us_3001_page.passwordKutusu.click();
    }

    @Given("{string} girer")
    public void girer(String password) {
        us_3001_page.passwordKutusu.sendKeys(password);
    }

    @Then("gmibank Password strength red görünür")
    public void gmibankPasswordStrengthRedGörünür() {

        Assert.assertTrue(us_3001_page.red.isDisplayed());

    }
}
