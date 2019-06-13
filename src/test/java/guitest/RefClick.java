package guitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RefClick extends BaseAction {

    public RefClick(WebDriver driver, String xpath) {
        super(driver, xpath);
    }

    public void doAction(){
        WebElement refElement = driver.findElement(by);
        refElement.click();
    }
}
