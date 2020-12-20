package ru.heisenbug;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void userCanSearchKeyword() {
        Configuration.browser = "firefox";
        open("https://duckduckgo.com");
        $(By.name("q"))
                .setValue("selenide heisenbug")
                .pressEnter();

        $$(".results--main .result").shouldHave(sizeGreaterThanOrEqual(5));

        sleep(6000);
//        $(".active-passive-english")
//                .shouldBe(Condition.visible)
//                .shouldHave(text("hello"), cssClass("grid"));
    }
}
