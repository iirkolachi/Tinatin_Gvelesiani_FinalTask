package Steps.SelenideSteps;

import Elements.SelenideElements.ChooseHotelElements;
import com.codeborne.selenide.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ChooseHotelSteps extends ChooseHotelElements {

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
        List<Double> orderedPrices = new ArrayList<>();
        for (SelenideElement element : prices) {
            String text = element.getText().trim();
            if (!text.isEmpty()) {
                text = text.replaceAll("[^0-9]", "");
                if (!text.isEmpty()) {
                    try {
                        orderedPrices.add(Double.parseDouble(text));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price format: " + text);
                    }
                }
            }
        }
        boolean isSorted = true;
        for (int i = 0; i < orderedPrices.size() - 1; i++) {
            if (orderedPrices.get(i) > orderedPrices.get(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The prices are sorted from low to high.");
        } else {
            System.out.println("The prices are not sorted from low to high.");
        }

        return this;
    }
    public ChooseHotelSteps takeMaxValue() {
        List<SelenideElement> sortedPrices = prices.stream()
                .sorted(Comparator.comparingDouble(e -> Double.parseDouble(e.getText().replaceAll("[^\\d.]", ""))))
                .toList();

        if (!sortedPrices.isEmpty()) {
            SelenideElement maxPriceElement = sortedPrices.getLast();
            System.out.println("Maximum price: " + maxPriceElement.getText());
        } else {
            System.out.println("No prices found.");
        }
        return this;
    }
    public ChooseHotelSteps takeMaxValueHotel() {
        List<String> pricesUnordered = prices.texts();
        List<Double> pricesDouble = pricesUnordered.stream()
                .map(text -> Double.parseDouble(text.replaceAll("[^\\d.]", "")))
                .toList();

        Double maxPrice = pricesDouble.stream().max(Double::compareTo).orElse(0.00);
        int maxPriceIndex = pricesDouble.indexOf(maxPrice);
        Selenide.executeJavaScript("arguments[0].click();",prices.get(maxPriceIndex).parent().parent().find("a"));
        return this;
    }
}