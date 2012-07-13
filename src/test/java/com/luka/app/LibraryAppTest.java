package com.luka.app;


import com.luka.app.console.TestConsole;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class LibraryAppTest {

    private TestConsole console;
    private LibraryApp libraryApp;

    @Before
    public void setUp() {
        console = new TestConsole();
        libraryApp = new LibraryApp(console);
    }

    @Test
    public void shouldWelcomeUserToTheSystem() {
        String expectedWelcomeMessage = "Hello asimha!";
        libraryApp.welcomeTheUser();

        assertEquals(expectedWelcomeMessage, removeNewLines(console.getOutputString()));
    }

    @Test
    public void shouldDisplayMenuToTheUser() {
        String expectedMenuMessage = "Please select one of the options below";
        String expectedViewBookMenu = "Enter 1 to View all Books";
        String expectedReserveBookMenu = "Enter 2 to Reserve a Book";
        String expectedQuitMenu = "Enter 3 to Quit";
        libraryApp.displayMenu();

        String actualOutputMessage = removeNewLines(console.getOutputString());
        assertTrue(actualOutputMessage.contains(expectedMenuMessage));
        assertTrue(actualOutputMessage.contains(expectedViewBookMenu));
        assertTrue(actualOutputMessage.contains(expectedReserveBookMenu));
        assertTrue(actualOutputMessage.contains(expectedQuitMenu));
    }

    private String removeNewLines(String message) {
        return message.replaceAll(System.getProperty("line.separator"), "");
    }
}
