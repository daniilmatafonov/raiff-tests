package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    @Step("Закрыть пригласительное окно")
    public void closeInvitationPopUp() {
        $("icon-close.one-click-popup__close").shouldBe(visible).click();
    }
}
