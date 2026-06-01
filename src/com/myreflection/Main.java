/**
 *  Java program to demonstrate reflection.
 */

package com.myreflection;

import java.lang.reflect.Constructor;

/**
 *  Main class.
 */
public class Main {

    // Constructor.
    public Main() {

        // Printing to the console.
        System.out.println("Hello 0.");

    }

    // Constructor.
    public Main(int i) {

        // Printing to the console.
        System.out.println("Hello 1.");

    }

    // Constructor.
    public Main(int i, int j) {

        // Printing to the console.
        System.out.println("Hello 2.");

    }

    // JVM entry point.
    public static void main(String[] args) {

        try {

            // Creating string with class address.
            String className = "com.myreflection.Main";

            // Creating instance of a class Main.
            Class testClass = Class.forName(className);

            // Getting all the constructors of the class Main.
            Constructor[] constructors = testClass.getConstructors();

            // Iterating through the constructors and printing them to the console.
            for (int i = 0; i < constructors.length; i++) {

                System.out.println(constructors[i].getName()); // Output: com.myreflection.Main
                                                               // com.myreflection.Main
                                                               // com.myreflection.Main

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}