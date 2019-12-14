package com.company;

public class Main {

    public static int convertToNumber(String value) {
        return Integer.parseInt(value);
    }
    public static void main(String[] args) {
	// write your code here
        int a = convertToNumber("10"); // done better
        int b = convertToNumber("20");
        System.out.println(a * b);
    }
}
