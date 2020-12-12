package com.company;

public class Main {

    public static void main(String[] args) {
	 int a = -12;
     int b = 20;
     int c = 35;
     int d = 13;
     int god = 304;
     String name = ("Сергей");


     System.out.println("Ответ на задачу номер 1: " + firstPart(a, b, c, d));
     System.out.println("Ответ на задачу номер 2: " + secondPart(a, b));
     System.out.println("Ответ на вопрос номер 3: " + printlnPart(a));
     System.out.println("Ответ на вопрос номер 4: " + namePart(name));
     System.out.println("Ответ на вопрос номер 5: " + leapyearPart(god));

    }
    public static double firstPart(double a, double b, double c, double d){

        return a * (b + (c / d));

    }
    public static boolean secondPart( int a, int b){
        boolean ans;
        ans = 10 <= (a + b) && (a + b) <= 20;
        return ans;
    }
    public static String printlnPart(int a){
         String otr;
        if(a < 0){
            otr = ("Отрицательное число");

        }else {
            otr = ("Положительное число");
        }
        return otr;
    }
    public static String namePart(String name){
        String hello = "Привет " + name + "!";
        return hello;
    }
    public static String leapyearPart(int god){
        String year;
        if (god % 4 == 0 && god % 100 !=0){
            year = "Год " + god + " високосный";
        }
        else if(god % 400 == 0){
            year = "Год " + god + " високосный";
        }
        else year = "Год " + god + " обычный";

        return year;
    }



}
