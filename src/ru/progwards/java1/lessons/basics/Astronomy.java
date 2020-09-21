package ru.progwards.java1.lessons.basics;

public class Astronomy {
     public static Double sphereSquare(Double r){
         double n = 3.14;
         System.out.println(4 * n * (r * r));
         return r;
     }
    public static Double earthSquare(){
         return sphereSquare(6371.2);
     }
    public static Double mercurySquare(){
        return sphereSquare(2439.7);
     }
    public static Double jupiterSquare(){
        return sphereSquare(71492.0);
     }
    public static Double earthVsMercury(){
         return earthSquare()/mercurySquare();
     }
    public static Double earthVsJupiter(){
        return earthSquare()/jupiterSquare();
     }
    public static void main(String[] args){
        earthVsMercury();
        earthVsJupiter();
    }
}


