package com.ethanium;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by Ethanium
 */
public class HighOrderFunction {

    public static void main(String[] args) {

        Supplier<String> str = stringTransform("hello", (a)-> {
                return a.toUpperCase();
        });
        System.out.println( str.get() );
    }

    // function that takes a function and returns a function
    static Supplier<String> stringTransform(final String a,
                                  final Function<String, String> transform) {
        return () -> {
            String aa = transform.apply(a);
            return aa;
        };

    }
}
