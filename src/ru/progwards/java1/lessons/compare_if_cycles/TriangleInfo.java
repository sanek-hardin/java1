package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = (a + b) > c && (a + c) > b && (c + b) > a;
        System.out.println(result);
        return result;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        boolean result = true;
         if ((c * c) == ((a * a) + (b * b))){
            System.out.println(true);
         }else if ((a * a) == ((c * c) + (b * b))){
             System.out.println(true);
         }else if ((b * b) == ((a * a) + (c * c))){
             System.out.println(true);
         }
        return result;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result = true;
        if (a == b){
            System.out.println(true);
             }
        else if (b == c){
            System.out.println(true);
        }
        else if (c == a){
            System.out.println(true); }
        else if (a != b && b != c){
            System.out.println(false);
        }
        return result;
    }
    public static void main(String[] args) {
        isTriangle(50, 10, 43);
        isRightTriangle(4, 5, 3 );
        isIsoscelesTriangle(5, 2, 4);

    }

    }

