package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class TopMenuPage extends BasePage{

    @Step("Открыть раздел избранное")
    public void showFavourites() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__favourites']").click();
    }

    @Step("Открыть раздел переводов")
    public void showTransfers() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__transfer']").click();
    }

    @Step("Открыть раздел платежей")
    public void showPayments() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__payment']").click();
    }

    @Step("Открыть раздел пополнения")
    public void showRecharges() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__recharge']").click();
    }

    @Step("Открыть раздел обмена")
    public void showExchanges() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__exchange']").click();
    }

    @Step("Перейти в раздел открытия")
    public void showOpens() {
        $("nav.actions-menu > a[data-qa-node='top-sidebar__open']").click();
    }
}
