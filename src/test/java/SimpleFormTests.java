import Pages.BasePage;
import Pages.SimpleFormPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleFormTests extends BasePage
{
    private SimpleFormPage simpleFormPage;
    private final By simpleFormDemoLink=By.linkText("Simple Form Demo");


    @BeforeMethod
        public void setUp(){
            super.setUp();
            simpleFormPage=new SimpleFormPage(driver);}


    @Test
        public void enterTextAndClickGetCheckedValue(){
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterTextInTextField("I've typed some text!");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult=driver.findElement(By.cssSelector("#message")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("I've typed some text!"));}


    @Test
        public void enterSymbolAndClickGetCheckedValue(){
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterTextInTextField("!@#$%^&*()");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult=driver.findElement(By.cssSelector("#message")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("!@#$%^&*()"));}


    @Test
        public void enterNumberAndClickGetCheckedValue(){
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterTextInTextField("06191998");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult=driver.findElement(By.cssSelector("#message")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("06191998"));}


    @Test
        public void enterSpaceAndClickGetCheckedValue(){
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterTextInTextField(" ");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult=driver.findElement(By.cssSelector("#message")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(""));}
}
