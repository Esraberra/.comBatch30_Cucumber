package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConcortHotelPage {

    public ConcortHotelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath="//input[@name='UserName']")
    public WebElement username;

    @FindBy(xpath="//input[@name='Password']")
    public WebElement password;

    @FindBy (xpath = "//li[contains( @id, 'Log')]")
    public WebElement loginLink;

    @FindBy (xpath = "//*[.='Try again please']")
    public WebElement isLoginFailed;

    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement enterButonu;



}
