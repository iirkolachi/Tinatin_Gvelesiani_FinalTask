package Steps.SeleniumSteps;

import Elements.SeleniumElements.ShoppingCartElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class ShoppingCartSteps extends ShoppingCartElements {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor jsExecutor;

    public ShoppingCartSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    public ShoppingCartSteps clickAdd() {
        WebElement button = driver.findElement(ShoppingCartElements.button);
        jsExecutor.executeScript("arguments[0].click();", button);
        driver.navigate().refresh();
        return this;
    }
    public ShoppingCartSteps checkBasket() {
        WebElement basketBefore = driver.findElement(ShoppingCartElements.basketBefore);
        WebElement basketAfter = driver.findElement(ShoppingCartElements.basketAfter);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ShoppingCartElements.basketAfter));
        basketAfter.click();
        Assert.assertNotSame(basketAfter,basketBefore);
        return this;
    }
    public ShoppingCartSteps checkProduct() {
        WebElement productInBasket = driver.findElement(ShoppingCartElements.productInBasket);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ShoppingCartElements.productInBasket));
        Assert.assertTrue(productInBasket.isDisplayed());
        System.out.println("Product is added!");
        return this;
    }
    public ShoppingCartSteps removeProduct() {
        WebElement remove = driver.findElement(ShoppingCartElements.remove);
        remove.click();
        return this;
    }
    public ShoppingCartSteps checkBasketAfterRemove() {
        WebElement emptyBasket = driver.findElement(ShoppingCartElements.emptyBasket);
        Assert.assertTrue(emptyBasket.isDisplayed());
        System.out.println("Basket is empty!");
        return this;
    }
}
