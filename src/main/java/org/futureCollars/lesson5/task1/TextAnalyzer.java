package org.futureCollars.lesson5.task1;

public class TextAnalyzer {
    public static void main(String[] args) {

        String inputText = "zakaz";

        if (containsAnyCharacters(inputText)) {
            System.out.println("Tekst zawiera jakiekolwiek znaki.");

            if (isPalindrome(inputText)) {
                System.out.println("Tekst jest palindromem.");
            } else {
                System.out.println("Tekst nie jest palindromem.");
            }

            int textLength = calculateTextLength(inputText);
            System.out.println("Długość tekstu: " + textLength);
        } else {
            System.out.println("Tekst nie zawiera żadnych znaków.");
        }
    }

    private static boolean containsAnyCharacters(String text) {
        return !text.isEmpty();
    }

    private static boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }

    private static int calculateTextLength(String text) {
        return text.length();
    }
}
