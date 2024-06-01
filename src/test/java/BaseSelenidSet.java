import com.codeborne.selenide.Configuration;

public class BaseSelenidSet {

    public void setUp() {

        Configuration.browser = "chrome";
        //Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "normal";

    }
}
