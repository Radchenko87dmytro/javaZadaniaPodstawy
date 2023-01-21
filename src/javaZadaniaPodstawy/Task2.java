package javaZadaniaPodstawy;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        float diameter = calculateCircumfenceOfCircle();
        float circumference = calculateCircumfenceOfCircle(diameter);
    }

    private  static float getDiametrFromUser(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextFloat();
    }


    private  static float calculateCircumfenceOfCircle(float diameter){
        return  2-3.14F * diameter/2;
    }
}
