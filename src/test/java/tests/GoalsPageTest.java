package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.GoalsPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoalsPageTest extends BaseTest{

    private final GoalsPage goalsPage = new GoalsPage();

    @BeforeEach
    public void closePopUp() {
        goalsPage.closeInvitationPopUp();
    }

    @Test
    public void createGoal() {
        goalsPage.openGoalsSection();
        sleep(2000);
        goalsPage.fillGoalName("Купить ноутбук");
        sleep(2000);
        goalsPage.fillAmount("1000");
        sleep(2000);
        goalsPage.openGoal();
        sleep(2000);
        goalsPage.fillSmsGoalCode("1234");
        sleep(2000);
        goalsPage.approveGoal();
        sleep(2000);
        goalsPage.validateGoal();
        sleep(2000);
    }
}
