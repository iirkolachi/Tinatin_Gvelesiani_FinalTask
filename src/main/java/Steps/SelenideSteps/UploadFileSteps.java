package Steps.SelenideSteps;

import Elements.SelenideElements.UploadFileElements;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.open;

public class UploadFileSteps extends UploadFileElements {

    public UploadFileSteps downloadFile() {
        if(download.isDisplayed()) {
            Selenide.executeJavaScript("arguments[0].click();", download);
        } else {
            Selenide.closeWebDriver();
        }
        return this;
    }
    public UploadFileSteps uploadFile() {
        open("https://webdriveruniversity.com/File-Upload/index.html");
        upload.uploadFromClasspath("file/invoice.pdf");

        //String filePath = "user.home\\Downloads\\invoice";
        //upload.uploadFile(new java.io.File(filePath));
        return this;
    }
}
