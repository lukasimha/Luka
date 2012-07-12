package com.luka.app;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;

public class LibraryAppTest {

    private LibraryApp libraryApp;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        libraryApp = new LibraryApp(new PrintStream(outputStream));
    }

    @Test
    public void shouldWelcomeUserToTheSystem() {
        String expectedWelcomeMessage = "Hello asimha!";
        libraryApp.welcomeTheUser();

        assertEquals(expectedWelcomeMessage, removeNewLines(outputStream.toString()));
    }

    private String removeNewLines(String message) {
        return message.replaceAll(System.getProperty("line.separator"), "");
    }
}
