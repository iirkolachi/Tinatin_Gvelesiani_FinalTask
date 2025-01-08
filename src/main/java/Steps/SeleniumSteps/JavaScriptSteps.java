package Steps.SeleniumSteps;

import Elements.SeleniumElements.JavaScriptElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class JavaScriptSteps extends JavaScriptElements {

    WebDriver driver;
    WebDriverWait wait;

    public JavaScriptSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public JavaScriptSteps clickJavaScript() {
        WebElement javascript = driver.findElement(JavaScriptElements.javaScript);
        wait.until(ExpectedConditions.visibilityOfElementLocated(JavaScriptElements.javaScript));
        javascript.click();
        return this;
    }

    public JavaScriptSteps checkCount() {
        WebElement count = driver.findElement(JavaScriptElements.count);
        String str = count.getText();
        String cleanedStr = str.replaceAll("[^0-9-]", "");
        int countAsInt = Integer.parseInt(cleanedStr);

        int liElementsSize = driver.findElements(liElements).size();
        Assert.assertEquals(liElementsSize, countAsInt);
        return this;
    }

    public JavaScriptSteps checkBooks() {
        List<WebElement> h3elements = driver.findElements(h3Elements);

        List<String> books = new ArrayList<>();
        for (WebElement element : h3elements) {
            books.add(element.getText());
        }
        for (String book : books) {
            boolean js = book.contains("JS") || book.contains("JavaScript");
            System.out.println("Is " + book + " about JavaScript? " + js);
        }
        return this;
    }
}
