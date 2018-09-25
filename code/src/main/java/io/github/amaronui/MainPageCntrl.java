package io.github.amaronui;

import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.ModelOperation;
import net.java.html.json.Property;

@Model(className = "MainPage", builder = "assign", properties = {
    @Property(name = "message", type = String.class)
})
final class MainPageCntrl {
    private static final String[] WORDS = {
        "beautiful", "magnificent", "amazing", "amaron", "fluid",
        "rich", "huge", "entertaining", "lovely"
    };

    static MainPage createModel() {
        final MainPage page = new MainPage();
        page.chooseMessage();
        return page;
    }

    @Function
    static void click(MainPage model) {
        model.chooseMessage();
    }

    @ModelOperation
    static void chooseMessage(MainPage model) {
        Externals.debugger();
        String select = WORDS[(int) (WORDS.length * Math.random())];
        model.assignMessage("Hello " + select + " world!");
    }
}
