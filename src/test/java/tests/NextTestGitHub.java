package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class NextTestGitHub {
    @Test
    void gitHubSoftAssertionsShouldHaveJunit5Example() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box").$(byTagName("button")).click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $$("ol").findBy(text("Using JUnit5 extend test class")).sibling(0)
                .shouldHave(text("@Test"));
    }
}