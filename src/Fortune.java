package src;

import java.util.Scanner;

public class Fortune {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num < 5) {
            System.out.println("Enjoy the good luck a friend brings you.");
        } else {
            System.out.println("Your shoe selection will make you happy today.");
        }
    }
}
