package com.luka.app;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

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

    @Test
    public void shouldDisplayMenuToTheUser() {
        String expectedMenuMessage = "Please select one of the options below";
        String expectedViewBookMenu = "Enter 1 to View All Books";
        String expectedReserveBookMenu = "Enter 2 to Reserve a Book";
        String expectedQuitMenu = "Enter 3 to Quit";
        libraryApp.displayMenu();

        String actualOutputMessage = removeNewLines(outputStream.toString());
        assertTrue(actualOutputMessage.contains(expectedMenuMessage));
        assertTrue(actualOutputMessage.contains(expectedViewBookMenu));
        assertTrue(actualOutputMessage.contains(expectedReserveBookMenu));
        assertTrue(actualOutputMessage.contains(expectedQuitMenu));
    }

    private String removeNewLines(String message) {
        return message.replaceAll(System.getProperty("line.separator"), "");
    }
}
