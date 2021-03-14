package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.GoalsPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoalsTest extends BaseTest{

    private final GoalsPage goalsPage = new GoalsPage();
    final Faker faker = new Faker();

    @BeforeEach
    public void closePopUp() {
        goalsPage.closeInvitationPopUp();
    }

    @Test
    public void createGoal() {
        String code = faker.number().digits(4);
        String amount = faker.number().digits(5);
        String musicInstrument = faker.music().instrument();
        goalsPage.openGoalsSection();
        sleep(2000);
        goalsPage.fillGoalName(musicInstrument);
        sleep(2000);
        goalsPage.fillAmount(amount);
        sleep(2000);
        goalsPage.openGoal();
        sleep(2000);
        goalsPage.fillSmsGoalCode(code);
        sleep(2000);
        goalsPage.approve();
        sleep(2000);
        goalsPage.validateOperation();
        sleep(2000);
    }
}
