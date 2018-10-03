package com.ethanium;

import java.util.function.BiFunction;

/**
 * Created by Ethanium
 */
public class FunctionAsFirstClassCitizen {

    public static void main(String[] args) {


        BiFunction<String, String, String> concat = (h,t) -> {
          return h+t;
        };

        System.out.println( concat.apply("Hello","World"));

        // we are able to assign new implementation to an ecisting function
        concat = FunctionAsFirstClassCitizen::spawnedConcat;

        System.out.println( concat.apply("Hello","World"));

        FunctionAsFirstClassCitizen c = new FunctionAsFirstClassCitizen();
        concat = c::awesomeConcat;

        System.out.println( concat.apply("Hello","World"));
    }

    static String spawnedConcat(String a, String b) {
        return a+"---"+b;
    }

    String awesomeConcat(String a, String b) {
        return "awesome" + (a+b);
    }
}
