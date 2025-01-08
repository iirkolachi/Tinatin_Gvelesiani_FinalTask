package Steps.SelenideSteps;

import Elements.SelenideElements.SignUpElements;
import com.codeborne.selenide.Condition;
import java.time.Duration;
import java.time.LocalTime;
import static com.codeborne.selenide.Selenide.open;

public class SignUpSteps extends SignUpElements {

    public static String mail;

    public SignUpSteps openWebsite() {
        open("https://www.phptravels.net/");
        return this;
    }
    public SignUpSteps clickSignUp() {
        dropdown.click();
        signUp.click();
        return this;
    }
    public SignUpSteps enterData() {
        LocalTime currentTime = LocalTime.now();
        String time= currentTime.toString();
        mail = time.replaceAll("[^0-9-]", "");
        firstName.setValue("Tinatin");
        lastName.setValue("Gvelesiani");
        countries.click();
        georgia.click();
        phone.setValue("555555555");
        email.setValue(mail + "@credo.ge");
        password.setValue("Selenide1");
        signUpButton.shouldBe(Condition.enabled, Duration.ofSeconds(120));
        signUpButton.click();
        return this;
    }
    public SignUpSteps checkSignUp() {
        welcome.shouldBe(Condition.visible);
        System.out.println(welcome.getText());
        return this;
    }
    public SignUpSteps logIn() {
        dropdown.click();
        login.click();
        return this;
    }
    public SignUpSteps enterLoginData() {
        loginEmail.setValue(mail + "@credo.ge");
        loginPass.setValue("Selenide1");
        loginButton.click();
        return this;
    }
}
