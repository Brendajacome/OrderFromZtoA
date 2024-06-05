package com.example.orderfromztoa;

public class HelloApplication {

    public static void main(String[] args) {
        char[] letters  = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int order = letters .length;
        for (int i = 0; i < order - 1; i++) {
            for (int j = 0; j < order - 1 - i; j++) {
                if (letters [j] < letters [j + 1]) {
                    char temp = letters [j];
                    letters [j] = letters [j + 1];
                    letters [j + 1] = temp;
                }
            }
        }

        System.out.println("The letters ordered from Z to A are:");
        for (int i = 0; i < order; i++) {
            System.out.print(letters [i] + " ");
        }
    }
}
