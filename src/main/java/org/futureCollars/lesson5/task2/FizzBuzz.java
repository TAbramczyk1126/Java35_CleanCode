package org.futureCollars.lesson5.task2;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            playFizzBuzz(i);
        }
    }

    public static void playFizzBuzz(int number) {
        if (isDivisible(number, 3) && isDivisible(number, 5)) {
            System.out.println("FizzBuzz");
        } else if (isDivisible(number, 5)) {
            System.out.println("Buzz");
        } else if (isDivisible(number, 3)) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }
    }

    public static boolean isDivisible(int number, int divider) {
        return number % divider == 0;
    }
}
