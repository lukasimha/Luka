package com.luka.app;

import java.io.PrintStream;

public class LibraryApp {

    private PrintStream out;

    public LibraryApp(PrintStream out) {
        this.out = out;
    }

    public void welcomeTheUser() {
        out.println(String.format("Hello %s!", System.getProperty("user.name")));
    }
}
