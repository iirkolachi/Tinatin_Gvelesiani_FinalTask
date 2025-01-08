package Elements.SelenideElements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ChooseHotelElements {
    public SelenideElement orderByDesc = $(Selectors.byId("desc"));
    public SelenideElement apply = $(Selectors.byAttribute("class", "btn btn-primary w-100 h-100 text-capitalize waves-effect"));
    public ElementsCollection cities = $$(Selectors.byXpath("//div[@class='col-md-9']//div[@class='row g-3 append_template justify-content-md-center']//div[@class='card--item col-12']//div[@class='card rounded-2']//div[@class='row']//div[@class='col-md-5']//div[@class='card-body p-2 overflow-hidden']//p[@class='card-text text-capitalize mb-0']"));
    public ElementsCollection prices = $$(Selectors.byXpath("//div[@class='col-md-9']//div[@class='row g-3 append_template justify-content-md-center']//div[@class='card--item col-12']//div[@class='card rounded-2']//div[@class='row']//div[@class='col-md-3 d-flex align-content-end flex-wrap mb-3 px-4']//p[@class='card-text h5 w-100 text-end']"));
}
