import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Part4 extends BaseSelenidSet{


    public SelenideElement ferstName = $x("//input[@id='firstName']");
    public SelenideElement lastName = $x("//input[@id='lastName']");
    public SelenideElement email = $x("//input[@id='userEmail']");
    public SelenideElement gender = $x("//input[@id='gender-radio-1']");
    public SelenideElement number = $x("//input[@id='userNumber']");
    public SelenideElement dateOfBirthMain = $x("//input[@id='dateOfBirthInput']");
    public SelenideElement dateOfBirthMonth = $x("//select[@class='react-datepicker__month-select']");
    public SelenideElement dateOfBirthMonthDecember = $x("//option[@value='11']");
    public SelenideElement dateOfBirthYears = $x("//select[@class='react-datepicker__year-select']");
    public SelenideElement dateOfBirthYears1991 = $x("//option[@value='1991']");
    public SelenideElement dateOfBirthDay = $x("//div[@class='react-datepicker__day react-datepicker__day--026']");
    public SelenideElement hobbies = $x("//input[@id='hobbies-checkbox-1']");



    @Test
    public void filFormTest2(){
        new BaseSelenidSet().setUp();
        open("https://demoqa.com/automation-practice-form");
        ferstName.setValue("Artem");
        lastName.setValue("Krutikov");
        email.setValue("stealthy_mzk@mail.ru");
        gender.click();
        number.setValue("89231331363");
        dateOfBirthMain.click();
        dateOfBirthMonth.click();
        dateOfBirthMonthDecember.click();
        dateOfBirthYears.click();
        dateOfBirthYears1991.click();
        dateOfBirthDay.click();
        hobbies.click();







    }
}
