import Pages.BasePage;
import Pages.FormDemoPage;
import Pages.SimpleFormPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormDemoTests extends BasePage
{
    private FormDemoPage formDemoPage;
    private final By formDemoPageLink=By.linkText("Input Form Submit");


    @BeforeMethod
        public void setUp(){
            super.setUp();
            formDemoPage=new FormDemoPage(driver);}
    @Test
        public void completeFormAndSubmitAndVerifyValidation() {
        driver.findElement(formDemoPageLink).click();

        formDemoPage.clickOnChoseAnOption();
        formDemoPage.clickOnRomania();

        formDemoPage.enterNameM("Dascalul Adrian");

        formDemoPage.enterEmailM("dadrian9874@yahoo.com");

        formDemoPage.enterPasswordM("12345qwerty");

        formDemoPage.enterCompanyM("World Domination SRL.");

        formDemoPage.enterWebsiteM("www.worldomination.com");

        formDemoPage.enterCityM("Baia Mare");

        formDemoPage.enterAddress1M("Strada aia");

        formDemoPage.enterAddress2M("Blocul ala");

        formDemoPage.enterStateM("Maramures");

        formDemoPage.enterZipCodeM("000001");

            formDemoPage.clickOnSubmitButton();
            String actualResult2=driver.findElement(By.cssSelector("#__next > div > section.mt-50 > div > div > div > div > p")).getText();
            System.out.println(actualResult2);
            Assert.assertTrue(actualResult2.contains("Thanks for contacting us, we will get back to you shortly."));}

}
