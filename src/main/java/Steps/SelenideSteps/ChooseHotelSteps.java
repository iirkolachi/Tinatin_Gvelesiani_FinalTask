package Steps.SelenideSteps;

import Elements.SelenideElements.ChooseHotelElements;
import com.codeborne.selenide.*;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChooseHotelSteps extends ChooseHotelElements {

    public List<Double> prices;

    public ChooseHotelSteps orderPrices() throws InterruptedException {
        orderByDesc.shouldBe(Condition.visible).click();
        apply.shouldBe(Condition.clickable).hover().click();
        Thread.sleep(3000);
        return this;
    }
    public ChooseHotelSteps checkCity() {
        List<SelenideElement> city = cities.stream()
                .sorted(Comparator.comparing(SelenideElement::getText))
                .toList();

        for (SelenideElement element : city) {
            String cityName = element.getText().trim();

            if (!cityName.isEmpty() && cityName.equalsIgnoreCase("Copenhagen")) {
                System.out.println("List is correctly ordered by city " + cityName);
                break;
            }
        }
        return this;
    }
    public ChooseHotelSteps checkPrices() {
         prices = pricesUpdated.stream()
                .map(element -> Double.parseDouble(element.parent().parent().getAttribute("data-price")))
                .toList();

        boolean isDescending = prices.stream()
                .sorted((a, b) -> Double.compare(b, a))
                .toList()
                .equals(prices);

        Assert.assertTrue(isDescending);
        System.out.println("Are prices in descending order? " + isDescending);
        return this;
    }


    public ChooseHotelSteps takeMaxValue() {
        double maxPrice = prices.stream().max(Double::compare).orElseThrow();
        System.out.println("Maximum price: " + maxPrice);
        return this;
    }
    public ChooseHotelSteps takeMaxValueHotel() {
        SelenideElement maxPriceElement = pricesUpdated.stream()
                .max(Comparator.comparingDouble(element -> Double.parseDouble(element.parent().parent().getAttribute("data-price"))))
                .orElseThrow(() -> new NoSuchElementException("No prices found"));

        System.out.println("Clicking on element with maximum price: " + maxPriceElement.parent().parent().getAttribute("data-price"));
        maxPriceElement.parent().parent().parent().parent().find("a").scrollTo().click(ClickOptions.usingJavaScript());
        return this;
    }
}