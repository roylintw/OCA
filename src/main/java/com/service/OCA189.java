package com.service;

public class OCA189 {

    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        /* line n1 */
        // A
        do {
            idx++;
        } while (idx >= size);
        // B
        while (idx < size) {
            idx++;
        }
        // C
        do {
            idx++;
        } while (idx < size - 1);

        // D
        do {
            idx++;
        } while (idx <= size);
        // E
        while (idx <= size - 1) {
            idx++;
        }
        System.out.print("The Top element: " + stack[idx]);
    }
}
