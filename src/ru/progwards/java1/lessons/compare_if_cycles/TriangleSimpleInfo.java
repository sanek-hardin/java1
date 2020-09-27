package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
      public static int maxSide(int a, int b, int c){
        if ((a > (b + c)) && (b > (a + c)) && (c > (b + a)));
        else if (a >= b && a >= c) return a;
        else if (b >= c && b >= a) return b;
        else if (c >= a && c >= b) return c; return 0;
      }
    public static int minSide(int a, int b, int c) {
        if ((a > (b + c)) && (b > (a + c)) && (c > (b + a))) ;
        else if (a <= c && a <= b) return a;
        else if (b <= c && b <= a) return b;
        else if (c <= a && c <= b) return c; return 0;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
          boolean result = a == b && b == c;
          System.out.println(result);
          return result;
    }
    public static void main(String[] args) {
maxSide(100,1100,1007);
minSide(31,10, 5);
isEquilateralTriangle(4, 4, 4);
   }
}
