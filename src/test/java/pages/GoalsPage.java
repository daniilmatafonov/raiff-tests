package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class GoalsPage extends BasePage{

    @Step("Открыть раздел целей")
    public void openGoalsSection() {
        $x("//nav[contains(@class, 'left-sidebar__nav')]/a[@data-qa-node='left-sidebar__goals']").shouldBe(visible).click();
    }

    @Step("Заполнить название цели")
    public void fillGoalName(String goalName) {
        $x("//div[contains(@class, 'goal-open-form__name-input')]//input").scrollIntoView(true).shouldBe(visible).setValue(goalName);
    }

    @Step("Заполнить сумму цели")
    public void fillAmount(String amount) {
        $("input.c-input-currency__input").shouldBe(visible).setValue(amount);
    }

    @Step("Открыть цель")
    public void openGoal() {
        $x("//button[@data-qa-node='submit-button']").shouldBe(visible).click();
    }

    @Step("Ввести смс-код для создания цели")
    public void fillSmsGoalCode(String code) {
        $x("//confirm-operation-sms//input").shouldBe(visible).setValue(code);
    }

    @Step("Подтвердить создание цели")
    public void approveGoal() {
        $("button.confirm-operation-row__side-submit").shouldBe(visible).click();
    }

    @Step("Проверить корректность создания цели")
    public void validateGoal() {
        $("success-operation-title.success-operation-title").shouldHave(text("Операция выполнена"));
    }
}
