package com.luka.app;

import com.luka.app.console.Console;

public class LibraryApp {

    private Console console;

    public LibraryApp(Console console) {
        this.console = console;
    }

    public void execute() {
        welcomeTheUser();
        displayMenu();
        readInputFromTheUser();
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

    public String readInputFromTheUser() {
        return console.readLine();
    }

    private LibraryApp println() {
        return println("");
    }

    private LibraryApp println(String message) {
        console.printLine(message);
        return this;
    }
}
