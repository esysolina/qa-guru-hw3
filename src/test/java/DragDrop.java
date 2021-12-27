import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class DragDrop {
    @Test
    void dragDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

//        SelenideElement element = $("#column-a");
//        actions().moveToElement(element).click(element).perform();

        $("#column-a").$("header").shouldHave(Condition.text("B"));
    }
}
