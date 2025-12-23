package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public  static boolean isPalindrome(int num) {
        String[] numbers = String.valueOf(Math.abs(num)).split("");
        for(int i = 0; i < numbers.length; i++) {
            if (!numbers[i].equals(numbers[numbers.length - 1 - i]) ){
                return false;
            }
        }
        return true;
    }

    public  static boolean isPerfectNumber(int num) {
        int result = 0;
        for(int i = 1; i <num; i++) {
            if(num%i == 0) {
                result += i;
            }
        }
        return result == num;
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }
        String text = "";
        String[] chars = String.valueOf(num).split("");
        String[] words = {"Zero", "One", "Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for (String character : chars) {
            text = text.concat(" " + words[Integer.parseInt(character)]);
        }
        return text.trim();
    }
}

