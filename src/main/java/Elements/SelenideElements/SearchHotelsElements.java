package Elements.SelenideElements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class SearchHotelsElements {

    public SelenideElement hotels = $(Selectors.byAttribute("href", "https://www.phptravels.net/hotels"));
    public SelenideElement checkin = $(Selectors.byId("checkin"));
    public SelenideElement nextMonth = $(Selectors.byAttribute("class","next"));
    public SelenideElement checkinDate = $(Selectors.byXpath("//*[@id='fadein']/div[4]/div[1]/table/tbody/tr[3]/td[2]"));
    public SelenideElement checkoutDate = $(Selectors.byXpath("//*[@id='fadein']/div[5]/div[1]/table/tbody/tr[3]/td[5]"));
    public SelenideElement cities = $(Selectors.byId("select2-hotels_city-container"));
    public SelenideElement cityInput = $(Selectors.byAttribute("class", "select2-search__field"));
    public SelenideElement city = $(Selectors.byXpath("//*[@id='select2-hotels_city-results']/li[normalize-space(.)='Copenhagen, Denmark']"));
    public SelenideElement search = $(Selectors.byAttribute("class", "search_button w-100 btn btn-primary btn-m rounded-sm font-700 text-uppercase btn-full waves-effect"));
}
