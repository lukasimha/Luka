package com.luka.app;

import com.luka.app.console.WindowConsole;

public class Main {
    public static void main(String[] args) {
        new LibraryApp(new WindowConsole()).execute();
    }
}
