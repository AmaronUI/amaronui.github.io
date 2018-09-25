package io.github.amaronui;

import net.java.html.json.Models;

public class Main {
    public static void main(String... args) {
        Object model;
        switch (args[0]) {
            case "mainpage": model = MainPageCntrl.createModel(); break;
            default:
                throw new IllegalStateException("Uknown page: " + args[0]);
        }
        Models.applyBindings(model);
    }
}
