package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double n = 3.14;
        double V = 4/3 * n * (radius*radius*radius);
        System.out.println(V);
        return V;
    }
    public static float volumeBallFloat(float radius){
        float n = 3.14f;
        float V = 4/3 * n * (radius*radius*radius);
        return V;
    }
    public static double calculateAccuracy(double radius){
        double result = volumeBallDouble((float) radius) - volumeBallFloat((float) radius);
        return result;
    }

    public static void main(String[] args) {
        //calculateAccuracy();
    }


}
