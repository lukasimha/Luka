package com.luka.app.console;

public class TestConsole implements Console {

    private StringBuilder output = new StringBuilder();
    private String input = new String();

    @Override
    public void printLine(String message) {
        output.append(message);
    }

    @Override
    public String readLine() {
        return input;
    }

    public String getOutputString() {
        return output.toString();
    }

    public void setInputString(String input) {
        this.input = input;
    }
}