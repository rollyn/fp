package com.ethanium;

/**
 * Created by Ethanium
 */
public class PureFunction {


    // pure function, multiple call will yield the same output
    static int addTwoNumbers(int a, int b) {
        return a+b;
    }

    // inpure function, not deterministic result since a,
    // can be change by other calle
    static int GLOBAL_A = 2;
    static int multTwoNumbers(int b) {
        return GLOBAL_A + b;
    }



    public static void main(String[] args) {

        int total = addTwoNumbers(1,2);

        // correct call if needs a global value as input,
        // pass a as parameter
        int total2 = addTwoNumbers(GLOBAL_A, 2);
    }
}
