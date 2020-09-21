package ru.progwards.java1.lessons.basics;

public class Astronomy {
     public static Double sphereSquare(Double r){
         double n = 3.14;
         double S = 4 * n * (r * r);
         System.out.println(S);
         return S;
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
         double result = earthSquare()/mercurySquare();
         return result;
     }
    public static Double earthVsJupiter(){
        double result = earthSquare()/jupiterSquare();
        return result;
     }
    public static void main(String[] args){
        earthVsMercury();
        earthVsJupiter();
    }
}


