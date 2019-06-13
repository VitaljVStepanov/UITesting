package guitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BaseAction {


    protected By by;
    protected WebDriver driver;

    public BaseAction(WebDriver driver, String xpath) {
        this.driver = driver;
        this.by = By.xpath(xpath);
    }

    public abstract void doAction();
}
