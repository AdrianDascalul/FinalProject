package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormDemoPage extends BasePage
{
    public FormDemoPage(WebDriver driver){
    super(driver);
    PageFactory.initElements(driver,this);}


    @FindBy(id="name")
        private WebElement name;
        public void enterNameM(String text){name.sendKeys(text);}


    @FindBy(id="inputEmail4")
        private WebElement email;
        public void enterEmailM(String text){email.sendKeys(text);}


    @FindBy(id="inputPassword4")
        private WebElement password;
        public void enterPasswordM(String text){password.sendKeys(text);}


    @FindBy(id="company")
        private WebElement company;
        public void enterCompanyM(String text){company.sendKeys(text);}


    @FindBy(id="websitename")
        private WebElement website;
        public void enterWebsiteM(String text){website.sendKeys(text);}


    @FindBy(id="inputCity")
        private WebElement city;
        public void enterCityM(String text){city.sendKeys(text);}


    @FindBy(id="inputAddress1")
        private WebElement address1;
        public void enterAddress1M(String text){address1.sendKeys(text);}


    @FindBy(id="inputAddress2")
        private WebElement address2;
        public void enterAddress2M(String text){address2.sendKeys(text);}


    @FindBy(id="inputState")
        private WebElement state;
        public void enterStateM(String text){state.sendKeys(text);}


    @FindBy(id="inputZip")
        private WebElement zipCode;
        public void enterZipCodeM(String text){zipCode.sendKeys(text);}


    @FindBy(css="#seleniumform > div:nth-child(3) > div.form-group.w-6\\/12.smtablet\\:w-full.pr-20.smtablet\\:pr-0 > select")
        private WebElement countryOptions;
        public void clickOnChoseAnOption(){countryOptions.click();}
    @FindBy(css="#seleniumform > div:nth-child(3) > div.form-group.w-6\\/12.smtablet\\:w-full.pr-20.smtablet\\:pr-0 > select > option:nth-child(184)")
        private WebElement romaniaButton;
        public void clickOnRomania(){romaniaButton.click();}


    @FindBy(css="#seleniumform > div.text-right.mt-20 > button")
        private WebElement submitButton;
        public void clickOnSubmitButton(){submitButton.click();}


    @FindBy(css="#__next > div > section.mt-50 > div > div > div > div > p")
        private WebElement checkValidationMessage;
        public void checkYourValidationMessage(){checkValidationMessage.getText();}
}
