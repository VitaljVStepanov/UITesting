package guitest.google.sberbank;

import guitest.BaseTest;
import guitest.RefClick;
import guitest.SearchString;
import org.junit.jupiter.api.Test;

public class GoogleSberbankTest extends BaseTest {

    public GoogleSberbankTest() {
        super("https://www.google.com/");
    }

    @Test
    public void doTest() {

        searchString = new SearchString(driver,"//input[@title='Поиск']");
        searchString.doAction("Сбербанк");

        refClick = new RefClick(driver,"//a[@href='https://www.sberbank.ru/ru/person']");
        refClick.doAction();
    }
}
