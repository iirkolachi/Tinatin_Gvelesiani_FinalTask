package Elements.SelenideElements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class UploadFileElements {
    public SelenideElement download = $(Selectors.byXpath("//*[@id='invoice']/div[4]/div[1]/button"));
    public SelenideElement upload = $(Selectors.byId("myFile"));
}
