package io.github.amaronui;

import net.java.html.js.JavaScriptBody;

final class Externals {
    Externals() {
    }

    @JavaScriptBody(args = {}, body = "debugger;")
    public static native void debugger();

    @JavaScriptBody(args = "msg", body = "alert(msg);")
    public static native void alert(String msg);

    @JavaScriptBody(args = "url", body = "window.location.href = url;")
    public static native void openURL(String url);

    @JavaScriptBody(args = { "url", "title" }, body = "window.open(url, title);")
    public static native void openNew(String url, String title);
}
