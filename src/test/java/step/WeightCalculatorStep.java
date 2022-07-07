package step;

import org.openqa.selenium.WebDriver;

public class WeightCalculatorStep extends pageobject.WeightCalculatorStep {
    public WeightCalculatorStep(WebDriver driver) {
        super(driver);
    }

    public void fillFormAndSubmit(String name,String height, String weight){
        fillInputName(name);
        fillInputHeight(height);
        fillInputWeight(weight);
        selectMaleGender();
        clickButtonSubmit();
    }
}
