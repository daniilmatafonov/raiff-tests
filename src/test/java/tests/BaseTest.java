package tests;

import com.codeborne.selenide.Configuration;
import config.IConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.AttachmentHelper.*;

public class BaseTest {

    private static final IConfig config = ConfigFactory.create(IConfig.class, System.getProperties());
    private static final String ALLURE_SELENIDE_LISTENER_NAME = "AllureSelenide";
    private static final String RAIFF_BANK_DEMO_PAGE_URL = "https://online.raiffeisen.ru/demo";

    @BeforeAll
    static void setup() {
        addListener(ALLURE_SELENIDE_LISTENER_NAME, new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.baseUrl = RAIFF_BANK_DEMO_PAGE_URL;
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        if (config.remoteUrl() != null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = config.remoteUrl();
        }
        open("/");
    }

    @AfterEach
    public void afterEach() {
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser logs", getLogs());
        if (config.videoStorage() != null)
            attachVideo();
        closeWebDriver();
    }
}
