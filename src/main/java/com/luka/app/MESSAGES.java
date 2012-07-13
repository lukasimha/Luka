package com.luka.app;

import java.util.Arrays;
import java.util.List;

public class Messages {

    public static final String WELCOME_USER = "Hello %s!";
    public static final String MENU_MESSAGE = "Please select one of the options below";
    public static final String VIEW_ALL_BOOKS_OPTION = "View all Books";
    public static final String RESERVE_BOOK_OPTION = "Reserve a Book";
    public static final String QUIT_OPTION = "Quit";

    public static List<String> MENU_OPTIONS = Arrays.asList(VIEW_ALL_BOOKS_OPTION, RESERVE_BOOK_OPTION, QUIT_OPTION);
}
