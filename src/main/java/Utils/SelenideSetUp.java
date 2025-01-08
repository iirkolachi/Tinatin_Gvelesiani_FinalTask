package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelenideSetUp {

    @BeforeTest
    public void setUpMethod() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
    @AfterTest
    public void quit() {
        Selenide.closeWebDriver();
    }
}
