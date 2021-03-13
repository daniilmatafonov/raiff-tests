package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BankDemoPage;

import static com.codeborne.selenide.Selenide.open;

public class BankDemoPageTest extends BaseTest{

    final BankDemoPage bankDemoPage = new BankDemoPage();

    @BeforeEach
    void closePopUp() {
        open("/");
        bankDemoPage.closeInvitationPopUp();
    }

    @Test
    public void createGoal() {
        bankDemoPage.openGoalsSection();
    }
}
