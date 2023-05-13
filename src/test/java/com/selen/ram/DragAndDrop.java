package com.selen.ram;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void gihubLessonTwo() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a>header").shouldHave(text("B"));
        $("#column-b>header").shouldHave(text("A"));
    }
}
