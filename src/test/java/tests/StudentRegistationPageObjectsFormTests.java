package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegistationPageObjectsFormTests {
    RegistrationPage registrationPage = new RegistrationPage();
    String firstName = "Rail";
    String lastName = "Valiullin";
    String userEmail = "testrail@mail.ru";
    String userNumber = "1234567890";
    String hobbie1 = "Sports";
    String hobbie2 = "Reading";
    String hobbie3 = "Music";
    String images = "852.jpg";
    String currentAddress = "Test adress";
    String state = "Haryana";
    String city = "Karnal";


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillRegistrationForm() {
        open("/automation-practice-form");

        String userSubjects= "Math";;
        registrationPage.openPage()
                .setFirstNameInput(firstName)
                .setLastNameInput(lastName)
                .setUserEmailInput(userEmail)
                .setGenderInput()
                .setMobileUserNumberInput(userNumber)
                .setDateOfBirthInput("22", "July", "1951")
                .hobbies(hobbie1, hobbie2, hobbie3)
                .setUploadPicturesInput(images)
                .setCurrentAddressInput(currentAddress)
                .setStateInput(state)
                .setCityInput(city)
                .setSubmitButtonClick();

        //проверка форм

        registrationPage.checkForm("Student Name", firstName + " " + lastName)
                .checkForm("Student Email", "testrail@mail.ru")
                .checkForm("Gender", "Male")
                .checkForm("Mobile", "1234567890")
                .checkForm("Date of Birth", "22 July,1951")
                .checkForm("Hobbies", "Sports" + ", " + "Reading" + ", " + "Music")
                .checkForm("Picture", "852.jpg")
                .checkForm("Address", "Test adress")
                .checkForm("State and City", "Haryana" + " " + "Karnal");
    }




}