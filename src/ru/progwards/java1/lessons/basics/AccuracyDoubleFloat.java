package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double n = 3.14;
        System.out.println(4/3 * n * (radius*radius*radius));
        return radius;
    }
    public static float volumeBallFloat(float radius){
        float n = 3.14f;
        System.out.println(4/3 * n * (radius*radius*radius));
        return radius;
    }
    public static double calculateAccuracy(double radius){
        double result = volumeBallDouble((float) radius) - volumeBallFloat((float) radius);
        return result;
    }

    public static void main(String[] args) {
        calculateAccuracy();
    }


}
