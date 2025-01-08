package Steps.SeleniumSteps;

import Elements.SeleniumElements.OrderElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class OrderSteps extends OrderElements {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor jsExecutor;

    public OrderSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    public OrderSteps billingDetails() {

        WebElement firstnameInput = driver.findElement(OrderElements.firstnameInput);
        firstnameInput.sendKeys("Tinatin");

        WebElement lastnameInput = driver.findElement(OrderElements.lastnameInput);
        lastnameInput.sendKeys("Gvelesiani");

        WebElement phoneInput = driver.findElement(OrderElements.phoneInput);
        phoneInput.sendKeys("1010101010");

        WebElement addressInput = driver.findElement(OrderElements.addressInput);
        addressInput.sendKeys("3000 Haul Road");

        WebElement cityInput = driver.findElement(OrderElements.cityInput);
        cityInput.sendKeys("Telangana");

        WebElement zipcodeInput = driver.findElement(OrderElements.zipcodeInput);
        zipcodeInput.sendKeys("1234");

        WebElement radioButton = driver.findElement(OrderElements.radioButton);
        jsExecutor.executeScript("arguments[0].click();", radioButton);

        WebElement orderButton = driver.findElement(OrderElements.orderButton);
        jsExecutor.executeScript("arguments[0].click();", orderButton);

        return this;
    }
    public OrderSteps checkOrderInfo() {
        WebElement paymentMethod = driver.findElement(OrderElements.paymentMethod);
        wait.until(ExpectedConditions.visibilityOfElementLocated(OrderElements.paymentMethod));
        Assert.assertTrue(paymentMethod.isDisplayed());

        WebElement book1 = driver.findElement(OrderElements.book1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(OrderElements.book1));
        Assert.assertTrue(book1.isDisplayed());

        WebElement book2 = driver.findElement(OrderElements.book2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(OrderElements.book2));
        Assert.assertTrue(book2.isDisplayed());

        if(paymentMethod.isDisplayed() && book1.isDisplayed() && book2.isDisplayed()) {
            System.out.println("Order details are correct!");
        } else {
            System.out.println("Order details are not correct!");
        }
        return this;
    }
    public OrderSteps clickMyAccount() {
        WebElement myAccount = driver.findElement(OrderElements.myAccount);
        myAccount.click();
        return this;
    }
    public OrderSteps clickOrders() {
        WebElement orders = driver.findElement(OrderElements.orders);
        wait.until(ExpectedConditions.visibilityOfElementLocated(OrderElements.orders));
        orders.click();
        return this;
    }
    public OrderSteps checkOrder() {
        WebElement checkOrder = driver.findElement(OrderElements.checkOrder);
        wait.until(ExpectedConditions.visibilityOfElementLocated(OrderElements.checkOrder));
        Assert.assertTrue(checkOrder.isDisplayed());
        if(checkOrder.isDisplayed()) {
            System.out.println("Order is placed.");
        }
        return this;
    }
}
