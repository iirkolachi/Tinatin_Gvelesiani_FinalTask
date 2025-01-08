package Steps.SelenideSteps;

import Elements.SelenideElements.SearchHotelsElements;
import com.codeborne.selenide.Condition;
import java.time.Duration;

public class SearchHotelsSteps extends SearchHotelsElements {

    public SearchHotelsSteps clickHotels() {
        hotels.click();
        return this;
    }
    public SearchHotelsSteps chooseCheckinDate() {
        checkin.click();
        nextMonth.click();
        checkinDate.click();
        return this;
    }
    public SearchHotelsSteps chooseCheckoutDate() {
        checkoutDate.click();
        return this;
    }
    public SearchHotelsSteps enterCity() {
        cities.click();
        cityInput.setValue("Copenhagen");
        return this;
    }
    public SearchHotelsSteps clickCity() {
        city.shouldBe(Condition.visible, Duration.ofSeconds(3));
        city.click();
        return this;
    }
    public SearchHotelsSteps searchHotel() {
        search.click();
        return this;
    }
}