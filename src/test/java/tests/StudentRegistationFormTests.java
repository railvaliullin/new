package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegistationFormTests {


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillRegistrationForm() {
        open("/automation-practice-form");
        $("#firstName").setValue("Rail");
        $("#lastName").setValue("Valiullin");
        $("#userEmail").setValue("testrail@mail.ru");
        $("#submit").scrollTo().click();
        $(byText("Male")).click();
        $("#userNumber").setValue("0123456789");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("1");
        $(".react-datepicker__year-select").selectOptionByValue("1990");
        $(".react-datepicker__day--029").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("852.jpg");
        $("#currentAddress").setValue("Ulica");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();
        $("#submit").click();
        $(".table").shouldHave(text("Rail"));
        $(".table").shouldHave(text("Valiullin"));
        $(".table").shouldHave(text("testrail@mail.ru"));
        $(".table").shouldHave(text("Male"));
        $(".table").shouldHave(text("0123456789"));
        $(".table").shouldHave(text("29 January,1990"));
        $(".table").shouldHave(text("852.jpg"));
        $(".table").shouldHave(text("NCR"));
        $(".table").shouldHave(text("Delhi"));


    }
}