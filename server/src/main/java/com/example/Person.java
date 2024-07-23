package com.example;

/**
 * This is a class.
 */
public class Person {

    /**
     * This is a constructor.
     */
    public Person() {

    }

    /**
     * @param someone 人名
     * @return java.lang.String
     * @author Jacky.Yu
     * @since 2024-07-23 10:58:01
     */
    public final String person(final String someone) {
        return String.format("Hello, %s!", someone);
    }
}
