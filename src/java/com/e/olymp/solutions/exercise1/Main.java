package src.java.com.e.olymp.solutions.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inNumber = in.nextInt();

        System.out.println(inNumber / 10 + " " + inNumber % 10);
    }
}