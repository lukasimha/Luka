package com.luka.app;

import java.io.PrintStream;

public class LibraryApp {

    private PrintStream out;

    public LibraryApp(PrintStream out) {
        this.out = out;
    }

    public void welcomeTheUser() {
        String welcomeUserMessage = String.format(MESSAGES.WELCOME_USER, System.getProperty("user.name"));
        println(welcomeUserMessage).println();
    }

    public void displayMenu() {
        println(MESSAGES.MENU_OPTION).println(MESSAGES.OPTION_1).println(MESSAGES.OPTION_2).println(MESSAGES.OPTION_3);
    }

    private LibraryApp println() {
        return println("");
    }

    private LibraryApp println(String message) {
        out.println(message);
        return this;
    }
}
