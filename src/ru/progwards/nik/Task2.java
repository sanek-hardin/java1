package ru.progwards.nik;

public class Task2 {
    public static void printJava() {
        String a = "Хорошо идут дела";
        String b = "Изучаю Java я!";
        String c = " ";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + c + b);
        System.out.println(b + c + a);
    }
    public static int subtraction(int x, int y){
        System.out.println("Вызвана функция subtraction() с параметрами x = " + x +", y = " + y );
        int z = x - y;
        return z;
    }
    public static int addition(int x, int y) {
        System.out.println("Вызвана функция addition() с параметрами x = " + x +", y = " + y );
        int z = x + y;
        return z;
    }
    public static int multiplication(int x, int y) {
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x +", y = " + y );
        int z = x * y;
        return z;
    }
    public static void calculation(){
        int a = 34;
        int b = 55;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("Вызвана функция addition() с параметрами x = "+ a +", y = "+ b );
        System.out.print("a + b = ");
        System.out.println(a+b);
        System.out.println("Вызвана функция subtraction() с параметрами x = "+ a +", y = "+ b );
        System.out.print("a - b = ");
        System.out.println(a-b);
        System.out.println("Вызвана функция multiplication() с параметрами x = "+ a +", y = "+ b );
        System.out.print("a * b = ");
        System.out.println(a*b);
    }
    public static void main(String[] args){
        printJava();
        subtraction(45,12);
        subtraction(23,55);
        addition(128,787);
        addition(528,387);
        multiplication(124,87);
        multiplication(1528,3);
    }
}
