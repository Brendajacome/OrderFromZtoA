package com.example.orderfromztoa;
import java.util.Arrays;

public class HelloApplication {

    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println("Order from  Z to A: ");
        order(letters, 0, letters.length - 1);
        System.out.println(Arrays.toString(letters));
    }

    private static void order(String[] letters, int start, int end) {
        if (start < end) {
            for (int i = start; i < end; i++) {
                if (letters[i].compareTo(letters[i + 1]) < 0) {
                    String temp = letters[i];
                    letters[i] = letters[i + 1];
                    letters[i + 1] = temp;
                }
            }
            order(letters, start, end - 1);
        }
    }
}
