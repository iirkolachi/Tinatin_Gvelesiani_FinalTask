package Elements.SelenideElements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class BookingElements {
    public SelenideElement bookNow = $(Selectors.byXpath("//button[@type='submit']//strong[@class='total-price fw-light']"));
    public SelenideElement firstnameRegistration = $(Selectors.byName("user[first_name]"));
    public SelenideElement lastnameRegistration = $(Selectors.byName("user[last_name]"));
    public SelenideElement emailRegistration = $(Selectors.byName("user[email]"));
    public SelenideElement phoneRegistration = $(Selectors.byName("user[phone]"));
    public SelenideElement addressRegistration = $(Selectors.byName("user[address]"));
    public SelenideElement firstname1 = $(Selectors.byName("firstname_1"));
    public SelenideElement lastname1 = $(Selectors.byName("lastname_1"));
    public SelenideElement firstname2 = $(Selectors.byName("firstname_2"));
    public SelenideElement lastname2 = $(Selectors.byName("lastname_2"));
    public SelenideElement childFirstname1 = $(Selectors.byName("child_firstname_1"));
    public SelenideElement childLastname1 = $(Selectors.byName("child_lastname_1"));
    public SelenideElement childFirstname2 = $(Selectors.byName("child_firstname_2"));
    public SelenideElement childLastname2 = $(Selectors.byName("child_lastname_2"));
    public SelenideElement payLater = $(Selectors.byId("gateway_pay_later"));
    public SelenideElement termsAndConditions = $(Selectors.byId("agreechb"));
    public SelenideElement bookingConfirm = $(Selectors.byId("booking"));
}
