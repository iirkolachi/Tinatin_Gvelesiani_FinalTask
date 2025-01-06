package SeleniumSteps;

import Elements.SeleniumElements.ShoppingCartElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ShoppingCartSteps extends ShoppingCartElements {

    WebDriver driver;
    WebDriverWait wait;

    public ShoppingCartSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public ShoppingCartSteps clickAdd() {
        WebElement button = driver.findElement(ShoppingCartElements.button);
        button.click();
        return this;
    }
    public ShoppingCartSteps checkBasket() throws InterruptedException {
        WebElement basketBefore = driver.findElement(ShoppingCartElements.basketBefore);
        WebElement basketAfter = driver.findElement(ShoppingCartElements.basketAfter);
        Assert.assertNotSame(basketAfter,basketBefore);
        Thread.sleep(2000);
        return this;
    }
    public ShoppingCartSteps openBasket() {
        WebElement basket = driver.findElement(ShoppingCartElements.basket);
        basket.click();
        return this;
    }
    public ShoppingCartSteps checkProduct() {
        WebElement productInBasket = driver.findElement(ShoppingCartElements.productInBasket);
        Assert.assertTrue(productInBasket.isDisplayed());
        System.out.println("Product is added!");
        return this;
    }
    public ShoppingCartSteps removeProduct() throws InterruptedException {
        WebElement remove = driver.findElement(ShoppingCartElements.remove);
        remove.click();
        Thread.sleep(2000);
        return this;
    }
    public ShoppingCartSteps checkBasketAfterRemove() {
        WebElement emptyBasket = driver.findElement(ShoppingCartElements.emptyBasket);
        Assert.assertTrue(emptyBasket.isDisplayed());
        System.out.println("Basket is empty!");
        return this;
    }
}
