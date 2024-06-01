
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
  @Test
  void fillFormTest(){
    open("https://demoqa.com/automation-practice-form");

    $("#userName").setValue("Alex Egorov");
    $("#=userEmail").setValue("stealthy_mzk@mail.ru");
    $("#=currentAddress").setValue("Mzk");
    $("#=permanentAddress").setValue("Brabskaya 14");

    $("#=submit").click();
    $("#=output").shouldHave(
            text("Alex Egorov"),
            text("stealthy_mzk@mail.ru"),
            text("Mzk"),
            text("Brabskaya 14"));

    }
}
