package SeleniumSteps;

import Elements.SeleniumElements.OrderElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public OrderSteps openSite() {
        driver.get("https://practice.automationtesting.in/checkout/");
        return this;
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
        radioButton.click();

        WebElement orderButton = driver.findElement(OrderElements.orderButton);
        orderButton.click();
        return this;
    }
}
