package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double n = 3.14;
        double V = 4.0 * n * (radius*radius*radius)/3;
        System.out.println(V);
        return V;
    }
    public static float volumeBallFloat(float radius){
        float n = 3.14f;
        float V1 = 4f * n * (radius*radius*radius)/3;
        System.out.println(V1);
        return V1;
    }
   public static double calculateAccuracy(double radius){
       return volumeBallDouble(6371.2) - volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        calculateAccuracy( 6371.2 );

    }
}
