package pages.Component;

import static com.codeborne.selenide.Selenide.$;

public class UploadComponent {
    public void uploadComponent (String picture) {
        $("#uploadPicture").uploadFromClasspath(picture);
    }
}
