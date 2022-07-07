import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.WeightCalculatorPage;

public class WeightCalculatorTest {

    @Test
    public void openPageTest() {
        By resultMessageLocator = By.xpath(" //tr[2]/td[2]");
        String name = "IVAN";
        String height = "183";
        String weight = "80";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(driver);
        weightCalculatorPage.fillInputName(name);
        weightCalculatorPage.fillInputHeight(height);
        weightCalculatorPage.fillInputWeight(weight);
        weightCalculatorPage.selectMaleGender();
        weightCalculatorPage.clickButtonSubmit();

        WebElement actualResult = driver.findElement(resultMessageLocator);
        String actualResultMessage = actualResult.getText();
        String expectedResultMessage = "Идеальная масса тела";
        Assert.assertEquals(expectedResultMessage, actualResultMessage);

        driver.quit();
    }
}
