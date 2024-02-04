package org.futureCollars.lesson5.task2;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (isDivisible(i, 3)) {
                System.out.println("Fizz");
            } else if (isDivisible(i, 5)) {
                System.out.println("Buzz");
            } else if (isDivisible(i, 3) && isDivisible(i, 5)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isDivisible(int number, int divider) {
        return number % divider == 0;
    }
}
