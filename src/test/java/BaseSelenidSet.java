import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseSelenidSet {

    public void setUp() {

        Configuration.browser = "chrome";
        //Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "normal";

    }

    @BeforeEach
    public void init(){
        setUp();
    }
    @AfterEach
    public  void  tearDown(){
        Selenide.closeWebDriver();
    }
}


