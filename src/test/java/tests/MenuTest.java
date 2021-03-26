package tests;

import org.junit.jupiter.api.Test;
import pages.TopMenuPage;

import static com.codeborne.selenide.Selenide.open;

public class MenuTest extends BaseTest{

    private final TopMenuPage menuPage = new TopMenuPage();

    @Test
    public void showMenuSections() {
        open("/");
        menuPage.closeInvitationPopUp();
        menuPage.showFavourites();
        menuPage.showTransfers();
        menuPage.showPayments();
        menuPage.showRecharges();
        menuPage.showExchanges();
        menuPage.showOpens();
    }
}
