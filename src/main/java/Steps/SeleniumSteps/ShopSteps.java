package Steps.SeleniumSteps;

import Elements.SeleniumElements.ShopElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ShopSteps extends ShopElements {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor jsExecutor;

    public ShopSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    public ShopSteps clickShop() {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement shop = explicitWait.until(webdriver -> webdriver.findElement(ShopElements.shop));
        shop.click();
        return this;
    }

    public ShopSteps orderBy() {
        WebElement filter = driver.findElement(ShopElements.sortingButton);
        jsExecutor.executeScript("arguments[0].click();", filter);
        return this;
    }

    public ShopSteps lowToHigh() {
        WebElement lowtohigh = driver.findElement(ShopElements.lowToHigh);
        lowtohigh.click();
        return this;
    }

    public ShopSteps checkOrder() {
        List<WebElement> prices = driver.findElements(pricesElement);

        List<Double> orderedPrices = new ArrayList<>();
        for (WebElement element : prices) {
            String text = element.getText().trim();
            if (!text.isEmpty()) {
                text = text.replaceAll("[^0-9]", "");
                if (!text.isEmpty()) {
                    try {
                        orderedPrices.add(Double.parseDouble(text));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price format: " + text);
                    }
                }
            }
        }
        boolean isSorted = true;
        for (int i = 0; i < orderedPrices.size() - 1; i++) {
            if (orderedPrices.get(i) > orderedPrices.get(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The prices are sorted from low to high.");
        } else {
            System.out.println("The prices are not sorted from low to high.");
        }
        return this;
    }
}
