package guitest;


import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.jupiter.api.*;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchString {
    private WebDriver driver;

    @BeforeAll
    public static void checkBrowserShim() {
        WebDriverManager.chromedriver().version("75.0.3770.8").setup();

    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void simpleTest() {
        String xpath = "//input[@title='Поиск']";
        SearchString searchString = new SearchString(driver,xpath);
        searchString.doSearch("Сбербанк");
    }
}
