package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.TopMenuPage;

import static com.codeborne.selenide.Selenide.sleep;

public class MenuTest extends BaseTest{

    private final TopMenuPage menuPage = new TopMenuPage();

    @BeforeEach
    public void closePopUp() {
        menuPage.closeInvitationPopUp();
    }

    @Test
    public void showMenuSections() {
        menuPage.openFavourites();
        sleep(2000);
        menuPage.openTransfers();
        sleep(2000);
    }
}
