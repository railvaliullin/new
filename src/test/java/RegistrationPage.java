package pages;

import Component.*;
import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.Date;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    //компоненты
    private CalendarComponent СalendarComponent = new CalendarComponent();
    private UploadComponent uploadComponent = new UploadComponent();
    private LineFillComponent lineFillComponent = new LineFillComponent();
    private ClickComponent clickComponent = new ClickComponent();
    private SubjectsComponent subjectsComponent = new SubjectsComponent();
    private StateAndCityComponent stateAndCityComponent = new StateAndCityComponent();
    private CheckFormComponent checkFormComponent = new CheckFormComponent();
    //locators
    SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    String firstNameLocator = "#firstName";
    String lastNameLocator = "#lastName";
    String userEmailLocator = "#userEmail";
    String genderLocator = ".custom-control-label";
    String mobileLocator = "#userNumber";
    String subjectLocator = "#subjectsInput";
    String addressLocator = "#currentAddress";
    String stateLocator = "#state";
    String cityLocator = "#city";
    String submitLocator = "#submit";
    String resultTableLocator = ".table-responsive";


    //actions
    public RegistrationPage openPage() {
        open("/automation-practice-form");
        SelenideElement headerTitle;
        headerTitle.shouldHave(text("Student Registration Form"));

        return this;
    }

    public RegistrationPage setFirstNameInput(String firstName) {
        //firstNameInput.setValue(firstName);
        lineFillComponent.lineFill(firstNameLocator, firstName);
        return this;
    }

    public RegistrationPage setLastNameInput(String lastName) {
        lineFillComponent.lineFill(lastNameLocator, lastName);
        return this;

    }

    public RegistrationPage setUserEmailInput(String userEmail) {
        lineFillComponent.lineFill(userEmailLocator, userEmail);
        return this;
    }

    public RegistrationPage setDateOfBirthInput(String day, String month, String year) {
        dateOfBirthInput.click();
        Date calendarComponent;
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setMobileUserNumberInput(String userNumber) {
        lineFillComponent.lineFill(mobileLocator, userNumber);
        return this;
    }

    public RegistrationPage setGenderInput() {
        clickComponent.clickMethod(genderLocator);
        return this;
    }

    public RegistrationPage hobbies(String value1, String value2, String value3) {
        $(byText(value1)).click();
        $(byText(value2)).click();
        $(byText(value3)).click();
        return this;
    }

    public RegistrationPage setUploadPicturesInput(String picture) {
        uploadComponent.uploadComponent(picture);
        return this;
    }public RegistrationPage setCurrentAddressInput(String currentAddress) {
        lineFillComponent.lineFill(addressLocator, currentAddress);
        return this;
    }

    public RegistrationPage setStateInput(String state) {
        stateAndCityComponent.stateAndCityComponent(stateLocator, state);
        return this;
    }

    public RegistrationPage setCityInput(String city) {
        stateAndCityComponent.stateAndCityComponent(cityLocator, city);
        return this;
    }

    public RegistrationPage setSubmitButtonClick() {
        clickComponent.clickMethod(submitLocator);
        return this;
    }

    public RegistrationPage checkForm(String fieldName, String value) {
        checkFormComponent.checkFormMethod(resultTableLocator, fieldName, value);
        return this;
    }

    public RegistrationPage setSubjectsInput(String value1, String value2, String value3) {
        subjectsComponent.subjectComponent(subjectLocator, value1);
        subjectsComponent.subjectComponent(subjectLocator, value2);
        subjectsComponent.subjectComponent(subjectLocator, value3);
        return this;
    }

}





