package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BankDemoPage;

public class BankDemoPageTest extends BaseTest{

    private final BankDemoPage bankDemoPage = new BankDemoPage();

    @BeforeEach
    public void closePopUp() {
        bankDemoPage.closeInvitationPopUp();
    }

    @Test
    public void createGoal() {
        bankDemoPage.openGoalsSection();
    }
}
