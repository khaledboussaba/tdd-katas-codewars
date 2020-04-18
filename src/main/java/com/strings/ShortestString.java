package com.strings;

public class ShortestString {

    public static int findShort(String inputString) {
        String[] inputs = inputString.split(" ");
        int result = inputs[0].length();
        for(int i = 1; i < inputs.length; i++) {
            if (inputs[i].length() < result) {
                result = inputs[i].length();
            }
        }
        return result;
    }

}
