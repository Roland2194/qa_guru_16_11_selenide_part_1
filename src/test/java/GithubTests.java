import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubTests {

    @Test
    void searchSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(text("Soft assertions"));
        $(".markdown-body").find(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
