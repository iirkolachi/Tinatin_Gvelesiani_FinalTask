package SeleniumSteps;

import Elements.SeleniumElements.LogInElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInSteps extends LogInElements {

    WebDriver driver;

    public LogInSteps(WebDriver driver) {
        this.driver = driver;
    }

    public LogInSteps openWebsite() {
        driver.get("https://practice.automationtesting.in/my-account/");
        return this;
    }
    public LogInSteps setEmail() {
        WebElement email = driver.findElement(LogInElements.email);
        email.sendKeys("tinatingvelesiani@credo.ge");
        return this;
    }
    public LogInSteps setPass() {
        WebElement pass = driver.findElement(LogInElements.pass);
        pass.sendKeys("Selenium123!");
        return this;
    }
    public LogInSteps clickRegister() {
        WebElement register = driver.findElement(LogInElements.register);
        register.click();
        return this;
    }
}
