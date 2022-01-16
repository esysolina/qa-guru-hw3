package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void selenideTest () {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(Condition.text("JUnit5"));
    }
}
