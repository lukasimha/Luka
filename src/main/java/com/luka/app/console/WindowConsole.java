package com.luka.app.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowConsole implements Console {

    @Override
    public void printLine(String message) {
        System.out.println(message);
    }

    @Override
    public String readLine() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            return bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}