package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WeightCalculatorStep {
    WebDriver driver;
    By inputNameLocator = By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input");
    By inputHeightLocator = By.xpath("//input[@name='height']");
    By inputWeightLocator = By.name("weight");
    By inputGenderLocator = By.xpath("//input[@value='m']");
    By buttonSubmitLocator = By.xpath("//input[@type='submit']");

    public WeightCalculatorStep(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInputName(String name) {
        WebElement inputName = driver.findElement(inputNameLocator);
        inputName.sendKeys(name);
    }

    public void fillInputHeight(String height) {
        WebElement inputHeight = driver.findElement(inputHeightLocator);
        inputHeight.sendKeys(height);
    }

    public void fillInputWeight(String weight) {
        WebElement inputWeight = driver.findElement(inputWeightLocator);
        inputWeight.sendKeys(weight);
    }

    public void selectMaleGender() {
        WebElement inputGender = driver.findElement(inputGenderLocator);
        inputGender.click();
    }

    public void clickButtonSubmit() {
        WebElement buttonSubmit = driver.findElement(buttonSubmitLocator);
        buttonSubmit.click();
    }
}
