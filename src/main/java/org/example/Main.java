package org.example;

public class Main {

    public static void main(String[] args) {
        String result = greetingsFromCsaba("Vasile");
        System.out.println(result);
    }

    public static String greetingsFromCsaba(String name) {
        return "Hello " + name + "!";
    }
}
