package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.LoansPage;

import static com.codeborne.selenide.Selenide.open;

public class LoansTest extends BaseTest {

    private final LoansPage loansPage = new LoansPage();
    private final Faker faker = new Faker();

    @Test
    public void closeCustomerLoanSuccess() {
        String code = faker.number().digits(4);
        open("/");
        loansPage.closeInvitationPopUp();
        loansPage.openLoansSection();
        loansPage.closeLoan();
        loansPage.chooseFullLoanSum();
        loansPage.submitRequest();
        loansPage.fillSmsGoalCode(code);
        loansPage.approve();
        loansPage.validateOperation();
    }
}
