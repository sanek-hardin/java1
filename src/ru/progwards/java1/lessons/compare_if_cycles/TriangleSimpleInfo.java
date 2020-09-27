package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
      public static int maxSide(int a, int b, int c){
        if ((a > (b + c)) && (b > (a + c)) && (c > (b + a)));
        else if (a > b && a > c)  {
            System.out.println(a);
        }
        else if (b > c && b > a) {
            System.out.println(b);
        }
        else if (c > a && c > b) {
            System.out.println(c);
        }
        return c;
                }
    public static int minSide(int a, int b, int c){
        if ((a > (b + c)) && (b > (a + c)) && (c > (b + a)));
        else if (a < c && a <b)  {
            System.out.println(a);
        }
        else if (b < c && b < a) {
            System.out.println(b);
        }
        else if (c < a && c < b) {
            System.out.println(c);
        }
        return c;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
          boolean result = a == b && b == c;
          System.out.println(result);
          return result;
    }
    public static void main(String[] args) {
maxSide(1,13,5);
maxSide(5,11,3);
maxSide(1,15,3);
minSide(125,13, 5);
minSide(5, 13, 4);
minSide(10, 13, 8);
isEquilateralTriangle(4, 4, 4);
   }
}
