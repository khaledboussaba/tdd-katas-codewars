package com.calcul;

import java.util.LinkedList;
import java.util.List;

public class Persist {

    public int persistence(long inputNumber) {
        List<Long> digits = numberToDigits(inputNumber);

        if (digits.size() == 1) {
            return 0;
        }

        int count = 0;
        long result = 1;
        while (digits.size() > 1){
            for (Long n: digits) {
                result *= n;
            }
            digits = numberToDigits(result);
            result = 1;
            count++;
        }
        return count;
    }

    private List<Long> numberToDigits(long number) {
        List<Long> digits = new LinkedList<>();

        while (number > 0) {
            digits.add(0, number % 10);
            number = number / 10;
        }
        return digits;
    }

}
