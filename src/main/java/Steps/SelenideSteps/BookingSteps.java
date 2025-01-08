package Steps.SelenideSteps;

import Elements.SelenideElements.BookingElements;
import com.codeborne.selenide.Selenide;
import static Steps.SelenideSteps.SignUpSteps.*;

public class BookingSteps extends BookingElements {

    public BookingSteps clickBook() {
        Selenide.executeJavaScript("arguments[0].click();", bookNow);
        return this;
    }
    public BookingSteps enterData() {
        firstnameRegistration.setValue("Tinatin");
        lastnameRegistration.setValue("Gvelesiani");
        emailRegistration.setValue(mail + "credo.ge");
        phoneRegistration.setValue("555555555");
        addressRegistration.setValue("Dannyvostok");
        firstname1.setValue("Tinatin");
        lastname1.setValue("Gvelesiani");
        firstname2.setValue("Tamar");
        lastname2.setValue("Kalatozi");
        if (childFirstname1.isDisplayed() || childLastname1.isDisplayed()
                || childFirstname2.isDisplayed() || childLastname2.isDisplayed()) {
            childFirstname1.setValue("Bavshviki1");
            childLastname1.setValue("Bavshviki1");
            childFirstname2.setValue("Bavshviki2");
            childLastname2.setValue("Bavshviki2");
        }
        Selenide.executeJavaScript("arguments[0].click();", payLater);
        Selenide.executeJavaScript("arguments[0].click();", termsAndConditions);
        Selenide.executeJavaScript("arguments[0].click();", bookingConfirm);
        return this;
    }
}
