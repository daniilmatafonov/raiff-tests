package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoansPage;

import static com.codeborne.selenide.Selenide.sleep;

public class LoansTest extends BaseTest {

    private final LoansPage loansPage = new LoansPage();
    private final Faker faker = new Faker();

    @BeforeEach
    public void closePopUp() {
        loansPage.closeInvitationPopUp();
    }

    @Test
    public void closeCustomerLoanSuccess() {
        String code = faker.number().digits(4);
        loansPage.openLoansSection();
        sleep(2000);
        loansPage.closeLoan();
        sleep(2000);
        loansPage.chooseFullLoanSum();
        sleep(2000);
        loansPage.submitRequest();
        sleep(2000);
        loansPage.fillSmsGoalCode(code);
        sleep(2000);
        loansPage.approve();
        sleep(2000);
        loansPage.validateOperation();
    }
}
