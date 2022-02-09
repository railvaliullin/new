import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Rail {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
}

    @Test
    void VoidFillRail() {
        open("/automation-practice-form");
        $("#firstName").setValue("Rail");
        $("#lastName").setValue("Valiullin");
        $("#userEmail").setValue("testrail@mail.ru");
        $(byText("Male")).click();
        $("#userNumber").setValue("0123456789");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("0");
        $(".react-datepicker__year-select").selectOptionByValue("2000");
        $(".react-datepicker__week ").$(byText("1")).click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("test-pic.jpg");
        $("#currentAddress").setValue("Ulica, dom 28");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();
        $("#submit").click();
        //Checking the correctness of filling out the form
        $(".table-responsive").shouldHave(
                text("Name LastName"),
                text("test@mail.ru"),
                text("Male"),
                text("0123456789"),
                text("01 January,2022"),
                text("Maths"),
                text("Sports"),
                text("test-pic.jpg"),
                text("Ulica, dom 28"),
                text("NCR Delhi")
        );
    }
}
