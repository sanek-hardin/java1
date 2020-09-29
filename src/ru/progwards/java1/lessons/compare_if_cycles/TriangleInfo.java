package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = (a + b) > c && (a + c) > b && (c + b) > a;
        System.out.println(result);
        return result;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        boolean result = false;
        if (c * c == (a * a + b * b)){
            result = true;
         }else if (a * a == (c * c + b * b)){
             result = true;
         }else if (b * b == (a * a) + (c * c)){
             result = true;
         }
        return result;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result = false;
        if (a == b && b == c){
            result = true;
             }
        if (a == b){
            result = true;
        }
        else if (b == c){
            result = true;
        }
        else if (c == a){
            result = true;
        }
        return result;
    }
    public static void main(String[] args) {
        isTriangle(50, 10, 43);
        isRightTriangle(3, 4, 5 );
        isIsoscelesTriangle(4, 2, 5);
    }
    }

