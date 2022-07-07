import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculatorTest {

    @Test
    public void openPageTest() {
        By inputNameLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input");
        By inputHeightLocator = By.xpath("//input[@name='height']");
        By inputWeightLocator = By.name("weight");
        By inputGenderLocator = By.xpath("//input[@value='m']");
        By buttonSubmitLocator = By.xpath("//input[@type='submit']");
        By resultMessageLocator = By.xpath(" //tr[2]/td[2]");
        String name = "IVAN";
        String height = "183";
        String weight = "80";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        WebElement inputName = driver.findElement(inputNameLocator);
        inputName.sendKeys(name);
        WebElement inputHeight = driver.findElement(inputHeightLocator);
        inputHeight.sendKeys(height);
        WebElement inputWeight = driver.findElement(inputWeightLocator);
        inputWeight.sendKeys(weight);
        WebElement inputGender = driver.findElement(inputGenderLocator);
        inputGender.click();
        WebElement buttonSubmit = driver.findElement(buttonSubmitLocator);
        buttonSubmit.click();

        WebElement actualResult = driver.findElement(resultMessageLocator);
        String actualResultMessage = actualResult.getText();
        String expectedResultMessage = "Идеальная масса тела";
        Assert.assertEquals(expectedResultMessage, actualResultMessage);


        driver.quit();
    }
}
