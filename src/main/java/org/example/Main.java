package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(numberToWords(974456));
    }
    public  static boolean isPalindrome(int num) {
        int number = Math.abs(num);
        return false;
    }

    public  static boolean isPerfectNumber(int num) {
        int result = 0;
        for(int i = 1; i <num; i++) {
            if(num%i == 0) {
                result += i;
            }
        }
        if(result==num) {
            return true;
        } else {
            return false;
        }
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }
        String text = "";
        String[] chars = String.valueOf(num).split("");
        String[] words = {"Zero", "One", "Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int i = 0; i < chars.length;i++) {
            text = text.concat(" " + words[Integer.parseInt(chars[i])]);
        }
        return text.trim();
    }
}

