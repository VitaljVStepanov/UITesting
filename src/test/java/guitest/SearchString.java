package guitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchString {


    private By by;
    private final WebDriver driver;

    public SearchString(WebDriver driver, String xpath) {
        this.driver = driver;
        this.by = By.xpath(xpath);
    }

    public void doSearch(String requestString){
        WebElement inputElement = driver.findElement(by);
        inputElement.sendKeys(requestString);
        inputElement.submit();
    }
}
