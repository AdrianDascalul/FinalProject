package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormDemo extends BasePage
{
    public FormPage(WebDriver driver){
    super(driver);
    PageFactory.initElements(driver,this);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterName(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterEmail(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterPassword(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){textField.sendKeys(text);}


    @FindBy(css="input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){textField.sendKeys(text);}
}
