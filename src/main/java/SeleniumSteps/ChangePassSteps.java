package SeleniumSteps;

import Elements.SeleniumElements.ChangePassElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class ChangePassSteps extends ChangePassElements {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor jsExecutor;

    public ChangePassSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    public ChangePassSteps clickAccountDetails() {
        WebElement accountDetails = driver.findElement(ChangePassSteps.accountDetails);
        accountDetails.click();
        return this;
    }
    public ChangePassSteps changeData() {
        WebElement firstname = driver.findElement(ChangePassElements.firstname);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ChangePassElements.firstname));
        firstname.sendKeys("Tinatin");

        WebElement lastname = driver.findElement(ChangePassElements.lastname);
        lastname.sendKeys("Gvelesiani");

        WebElement currentPass = driver.findElement(ChangePassElements.currentPass);
        currentPass.sendKeys("Selenium123!");

        WebElement newPass = driver.findElement(ChangePassElements.newPass);
        newPass.sendKeys("Selenide123!");

        WebElement confirmNewPass = driver.findElement(ChangePassElements.confirmNewPass);
        confirmNewPass.sendKeys("Selenide123!");

        WebElement saveChanges = driver.findElement(ChangePassElements.saveChanges);
        jsExecutor.executeScript("arguments[0].click();", saveChanges);
        return this;
    }
    public ChangePassSteps logout() {
        WebElement logout = driver.findElement(ChangePassElements.logout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ChangePassElements.logout));
        logout.click();
        return this;
    }
    public ChangePassSteps loginWithNewData() {
        WebElement username = driver.findElement(ChangePassElements.username);
        username.sendKeys("tinatingvelesiani@credo.ge");

        WebElement pass = driver.findElement(ChangePassElements.pass);
        pass.sendKeys("Selenium123!");

        WebElement loginButton = driver.findElement(ChangePassElements.loginButton);
        loginButton.click();
        return this;
    }
    public ChangePassSteps checkLogin() {
        WebElement myName = driver.findElement(ChangePassElements.myName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ChangePassElements.myName));
        Assert.assertTrue(myName.isDisplayed());
        return this;
    }
}
