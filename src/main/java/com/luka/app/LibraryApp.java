package com.luka.app;

import java.io.PrintStream;

public class LibraryApp {

    private PrintStream out;

    public LibraryApp(PrintStream out) {
        this.out = out;
    }

    public void welcomeTheUser() {
        String welcomeUserMessage = String.format(Messages.WELCOME_USER, System.getProperty("user.name"));
        println(welcomeUserMessage).println();
    }

    public void displayMenu() {
        println(Messages.MENU_MESSAGE);
        for (int i=0; i< Messages.MENU_OPTIONS.size(); i++) {
            println(String.format("Enter %d to %s", i+1, Messages.MENU_OPTIONS.get(i)));
        }
    }

    private LibraryApp println() {
        return println("");
    }

    private LibraryApp println(String message) {
        out.println(message);
        return this;
    }
}
