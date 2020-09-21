package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);
        return 0;
    }
    public static void main(String[] args) {
        reverseDigits(123);
    }
}




