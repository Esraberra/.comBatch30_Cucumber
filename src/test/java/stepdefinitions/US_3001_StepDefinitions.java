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
    public void girer(String password) throws InterruptedException {
        us_3001_page.passwordKutusu.sendKeys(password);
        Thread.sleep(3000);
    }

    @Then("gmibank Password strength red görünür")
    public void gmibankPasswordStrengthRedGörünür() {

        Assert.assertTrue(us_3001_page.red.isDisplayed());

    }

    @Then("gmibank Password strength orange görünür")
    public void gmibankPasswordStrengthOrangeGörünür() {

        Assert.assertTrue(us_3001_page.orange.isDisplayed());
    }

    @Then("gmibank Password strength yellow görünür")
    public void gmibankPasswordStrengthYellowGörünür() {

        Assert.assertTrue(us_3001_page.yellow.isDisplayed());
    }

    @Then("gmibank Password strength lightgreen görünür")
    public void gmibankPasswordStrengthLightgreenGörünür() {

        Assert.assertTrue(us_3001_page.lightgreen.isDisplayed());
    }

    @Then("gmibank Password strength green görünür")
    public void gmibankPasswordStrengthGreenGörünür() {

        Assert.assertTrue(us_3001_page.green.isDisplayed());
    }
}
