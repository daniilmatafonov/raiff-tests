package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    @Step("Закрыть пригласительное окно")
    public void closeInvitationPopUp() {
        $("icon-close.one-click-popup__close").shouldBe(visible).click();
    }

    @Step("Ввести смс-код")
    public void fillSmsGoalCode(String code) {
        $("confirm-operation-sms input").shouldBe(visible).setValue(code);
    }

    @Step("Подтвердить операцию")
    public void approve() {
        $("button.confirm-operation-row__side-submit").shouldBe(visible).click();
    }

    @Step("Проверить корректность проведения операции")
    public void validateOperation() {
        $("success-operation-title.success-operation-title").shouldHave(text("Операция выполнена"));
    }
}
