package guitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchString extends BaseAction {

    public SearchString(WebDriver driver, String xpath) {
        super(driver,xpath);
    }

    public void doAction(){}

    public void doAction(String requestString){
        WebElement inputElement = driver.findElement(by);
        inputElement.sendKeys(requestString);
        inputElement.submit();
    }
}
