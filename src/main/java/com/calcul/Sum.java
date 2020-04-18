package com.calcul;

public class Sum {

    public int getSum(int firstNumber, int secondNumber) {
        int result = 0;
        for(int index = Math.min(firstNumber, secondNumber); index <= Math.max(firstNumber, secondNumber); index++) {
            result += index;
        }
        return result;
    }

}
