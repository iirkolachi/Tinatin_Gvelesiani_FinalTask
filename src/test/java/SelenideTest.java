import Steps.SelenideSteps.*;
import Utils.SelenideSetUp;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest extends SelenideSetUp {

    @Test (priority = 1)
    public void signUpTest() {
        SignUpSteps loginsteps = new SignUpSteps();

        loginsteps.openWebsite()
                .clickSignUp()
                .enterData()
                .checkSignUp()
                .logIn()
                .enterLoginData();
    }
    @Test (priority = 2)
    public void searchHotelTest() {
        SearchHotelsSteps searchHotel = new SearchHotelsSteps();

        searchHotel.clickHotels()
                .chooseCheckinDate()
                .chooseCheckoutDate()
                .enterCity()
                .clickCity()
                .searchHotel();
    }
    @Test (priority = 3)
    public void chooseHotelTest() throws InterruptedException {
        ChooseHotelSteps chooseHotel = new ChooseHotelSteps();

        chooseHotel.orderPrices()
                .checkCity()
                .checkPrices()
                .takeMaxValue()
                .takeMaxValueHotel();
    }
    @Test (priority = 4)
    public void bookingTest() {
        BookingSteps bookingsteps = new BookingSteps();

        bookingsteps.clickBook()
                .enterData();
    }
    @Test (priority = 5)
    public void fileTest() {
        UploadFileSteps uploadfilesteps = new UploadFileSteps();

        uploadfilesteps.downloadFile()
                .uploadFile();
    }
}
