package com.selen.ram;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ThirdLessonTest extends TestBaseTest{
    @Test
    void thirdLesson()  {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".wiki-more-pages-link").$("[type='button']").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
