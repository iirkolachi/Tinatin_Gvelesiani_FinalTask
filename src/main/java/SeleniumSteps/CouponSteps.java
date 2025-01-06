package SeleniumSteps;

import Elements.SeleniumElements.CouponElements;
import Elements.SeleniumElements.OrderElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class CouponSteps extends CouponElements {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor jsExecutor;

    public CouponSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    public CouponSteps returnToShop() {
        WebElement returnButton = driver.findElement(CouponElements.returnButton);
        returnButton.click();
        return this;
    }
    public CouponSteps chooseNewBooks() throws InterruptedException {
        WebElement html5forms = driver.findElement(CouponElements.html5forms);
        jsExecutor.executeScript("arguments[0].click();",html5forms);
        Thread.sleep(2000);

        WebElement seleniumRuby = driver.findElement(CouponElements.seleniumRuby);
        jsExecutor.executeScript("arguments[0].click();",seleniumRuby);
        Thread.sleep(2000);
        return this;
    }
    public CouponSteps openCart() throws InterruptedException {
        WebElement basket = driver.findElement(CouponElements.basket);
        basket.click();
        Thread.sleep(2000);
        return this;
    }
    public CouponSteps addCoupon() {
        WebElement couponInput = driver.findElement(CouponElements.couponInput);
        couponInput.sendKeys("krishnasakinala");

        WebElement applyButton = driver.findElement(CouponElements.applyButton);
        applyButton.click();
        return this;
    }
    public CouponSteps checkCoupon() {
        WebElement checkCoupon = driver.findElement(CouponElements.checkCoupon);
        Assert.assertTrue(checkCoupon.isDisplayed());
        System.out.println("Coupon is applied.");
        return this;
    }
    public CouponSteps removeCoupon() throws InterruptedException {
        WebElement removeCoupon = driver.findElement(CouponElements.removeCoupon);
        jsExecutor.executeScript("arguments[0].click();", removeCoupon);
        Thread.sleep(2000);
        System.out.println("Coupon is deleted.");
        return this;
    }
    public CouponSteps checkAfterRemove() {
        WebElement afterRemove = driver.findElement(CouponElements.afterRemove);
        if(!afterRemove.getText().contains("krishnasakinala")) {
            System.out.println("Coupon has been removed.");
        }
        return this;
    }
    public CouponSteps addCouponAgain() {
        WebElement couponInput = driver.findElement(CouponElements.couponInput);
        couponInput.sendKeys("krishnasakinala");

        WebElement applyButton = driver.findElement(CouponElements.applyButton);
        applyButton.click();
        return this;
    }
    public CouponSteps checkCouponAgain() {
        WebElement checkCoupon = driver.findElement(CouponElements.checkCoupon);
        Assert.assertTrue(checkCoupon.isDisplayed());
        System.out.println("Coupon is applied again.");
        return this;
    }
    public CouponSteps clickCheckout() {
        WebElement checkoutButton = driver.findElement(OrderElements.checkoutButton);
        jsExecutor.executeScript("arguments[0].click();", checkoutButton);
        return this;
    }
}
