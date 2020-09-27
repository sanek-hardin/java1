package ru.progwards.java1.lessons.test;

public class Test1 {
    static long factorial(long n){
        long result = 1;
        for (long i = 1; i == n; i++) {
            result = result * i;
            System.out.println(result);
        }
        return result;
    }


    public static void main(String[] args) {
factorial(10);
    }
//    Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)
//
//    Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1
}

