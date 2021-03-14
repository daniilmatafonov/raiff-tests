package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GoalsPage extends BasePage{

    @Step("Открыть раздел целей")
    public void openGoalsSection() {
        $("nav.left-sidebar__nav > a[data-qa-node='left-sidebar__goals']").shouldBe(visible).click();
    }

    @Step("Заполнить название цели")
    public void fillGoalName(String goalName) {
        $("div.goal-open-form__name-input input").scrollIntoView(true).shouldBe(visible).setValue(goalName);
    }

    @Step("Заполнить сумму цели")
    public void fillAmount(String amount) {
        $("input.c-input-currency__input").shouldBe(visible).setValue(amount);
    }

    @Step("Открыть цель")
    public void openGoal() {
        $("button[data-qa-node='submit-button']").shouldBe(visible).click();
    }


    @Step("Проверить корректность проведения операции")
    public void validateOperation() {
        $("success-operation-title.success-operation-title").shouldHave(text("Операция выполнена"));
    }
}
