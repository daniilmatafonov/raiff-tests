package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BankDemoPage {

    @Step("Закрыть пригласительное окно")
    public void closeInvitationPopUp(){
        $("icon-close.one-click-popup__close").shouldBe(visible).click();
    }

    @Step("Открыть раздел целей")
    public void openGoalsSection(){
        $x("//nav[contains(@class, 'left-sidebar__nav')]/a[@data-qa-node='left-sidebar__goals']").shouldBe(visible).click();
    }
}
