package ru.progwards.java1.lessons.basics;

public class Astronomy {
     public static Double sphereSquare(Double r){
         double n = 3.14;
         double S;
         S = 4 * n * (r*r);
         System.out.println(S + " км");
         return r;
    }
    public static Double earthSquare(){
         double r = 0;
         System.out.print("площадь поверхности Земли = ");
         sphereSquare(6371.2);
         return r;
    }
    public static Double mercurySquare(){
        double r = 0;
        System.out.print("площадь поверхности Меркурия  = ");
        sphereSquare(2439.7);
        return r;
    }
    public static Double jupiterSquare(){
        double r = 0;
        System.out.print("площадь поверхности Юпитера  = ");
        sphereSquare((double) 71492);
        return r;
    }
    public static void main(String[] args){
        earthSquare();
        mercurySquare();
        jupiterSquare();
    }
}


