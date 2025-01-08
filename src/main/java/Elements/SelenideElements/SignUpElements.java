package Elements.SelenideElements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class SignUpElements {

    public SelenideElement dropdown = $(Selectors.byAttribute("class","m-0 text-dark text-uppercase"));
    public SelenideElement signUp = $(Selectors.byAttribute("href","https://www.phptravels.net/signup"));
    public SelenideElement firstName = $(Selectors.byId("firstname"));
    public SelenideElement lastName = $(Selectors.byId("last_name"));
    public SelenideElement countries = $(Selectors.byTitle("Select Country"));
    public SelenideElement georgia = $(Selectors.byId("bs-select-1-79"));
    public SelenideElement phone = $(Selectors.byId("phone"));
    public SelenideElement email = $(Selectors.byId("user_email"));
    public SelenideElement password = $(Selectors.byId("password"));
    public SelenideElement signUpButton = $(Selectors.byId("submitBTN"));
    public SelenideElement welcome = $(Selectors.byXpath("//strong[text()='Your account has been created']"));
    public SelenideElement login = $(Selectors.byAttribute("href","https://www.phptravels.net/login"));
    public SelenideElement loginEmail = $(Selectors.byId("email"));
    public SelenideElement loginPass = $(Selectors.byId("password"));
    public SelenideElement loginButton = $(Selectors.byId("submitBTN"));
}
