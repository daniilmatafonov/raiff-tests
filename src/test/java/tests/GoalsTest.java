package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pages.GoalsPage;

import static com.codeborne.selenide.Selenide.open;

public class GoalsTest extends BaseTest{

    private final GoalsPage goalsPage = new GoalsPage();
    private final Faker faker = new Faker();

    // TODO: 26.03.2021 Отключил тест по созданию финансовой цели из-за недоступности раздела на сайте банка.
    @Disabled
    @Test
    public void createGoalSuccess() {
        String code = faker.number().digits(4);
        String amount = faker.number().digits(5);
        String musicInstrument = faker.music().instrument();
        open("/");
        goalsPage.closeInvitationPopUp();
        goalsPage.openGoalsSection();
        goalsPage.fillGoalName(musicInstrument);
        goalsPage.fillAmount(amount);
        goalsPage.openGoal();
        goalsPage.fillSmsGoalCode(code);
        goalsPage.approve();
        goalsPage.validateOperation();
    }
}
