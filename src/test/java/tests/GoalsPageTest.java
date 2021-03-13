package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.GoalsPage;

public class GoalsPageTest extends BaseTest{

    private final GoalsPage goalsPage = new GoalsPage();

    @BeforeEach
    public void closePopUp() {
        goalsPage.closeInvitationPopUp();
    }

    @Test
    public void createGoal() {
        goalsPage.openGoalsSection();
        goalsPage.fillGoalName("Купить ноутбук");
        goalsPage.fillAmount("1000");
        goalsPage.openGoal();
        goalsPage.fillSmsGoalCode("1234");
        goalsPage.approveGoal();
        goalsPage.validateGoal();
    }
}
