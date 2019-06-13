package guitest;


import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.jupiter.api.*;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    protected SearchString searchString;
    protected RefClick refClick;
    protected String url;


    public BaseTest(String url) {
        this.url = url;
    }

    @BeforeAll
    public static void checkBrowserShim() {
        WebDriverManager.chromedriver().version("75.0.3770.8").setup();

    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void doTest() {

    }
}
