package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TopMenuPage extends BasePage{

    @Step("Открыть раздел избранное")
    public void openFavourites() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__favourites']").shouldBe(visible).click();
    }

    @Step("Открыть раздел переводов")
    public void openTransfers() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__transfer']").shouldBe(visible).click();
    }
}
