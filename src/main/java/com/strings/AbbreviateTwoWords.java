package com.strings;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] wordsOfName = name.split(" ");
        return wordsOfName[0].toUpperCase().charAt(0) + "." + wordsOfName[1].toUpperCase().charAt(0);
    }

}
