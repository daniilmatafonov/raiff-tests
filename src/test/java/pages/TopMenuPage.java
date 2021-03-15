package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TopMenuPage extends BasePage{

    @Step("Открыть раздел избранное")
    public void showFavourites() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__favourites']").shouldBe(visible).click();
    }

    @Step("Открыть раздел переводов")
    public void showTransfers() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__transfer']").shouldBe(visible).click();
    }

    @Step("Открыть раздел платежей")
    public void showPayments() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__payment']").shouldBe(visible).click();
    }

    @Step("Открыть раздел пополнения")
    public void showRecharges() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__recharge']").shouldBe(visible).click();
    }

    @Step("Открыть раздел обмена")
    public void showExchanges() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__exchange']").shouldBe(visible).click();
    }

    @Step("Перейти в раздел открытия")
    public void showOpens() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__open']").shouldBe(visible).click();
    }
}
