package Lesson2.HomeWork;

 import javax.print.attribute.standard.NumberUp;
 import javax.print.attribute.standard.NumberUpSupported;

public class HomeWork1 {
    public static void main (String[] args){

        //Задание 1

        System.out.println("Задание 1");

        int[] arrayInt = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};


        for (int i = 0;i < arrayInt.length; i++){

            if (arrayInt[i] == 0){
                arrayInt[i] = 1;
            }else{
                arrayInt[i] = 0;
            }
            System.out.print(arrayInt[i]);
        }
            System.out.println();



        // Задание 2

        System.out.println("Задание 2");
        int b = 1;
        int[] mas = new int[8];

        for(int i = 0; i < mas.length; i++){

            mas[i] = b;
            System.out.print(" " + mas[i]);
            b+=3;

        }
        System.out.println();



        //Задание 3

        System.out.println(" Задание 3");
        int[] delete = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        for(int i = 0; i < delete.length; i++){
            if (delete[i] < 6){
                delete[i] = delete[i] * 2;
                System.out.print(" " + delete[i]);
            } else {
                System.out.print(" " + delete[i]);
            }
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        int[] mas1 = {1, 200, 300, 134, 123, -123, -500, 1000};
        int min = 1;
        int max = 1;
        for(int i = 0; i < mas1.length; i++){
            max = Math.max(max,mas1[i]);
        }
        for(int i = 0; i < mas1.length; i++){
            min = Math.min(min, mas1.length);
        }

        System.out.print("Максимальное число: " + max + "\t");
        System.out.println("Минимальное число: " + min);

        // Задание 5*
        System.out.println("Задание 5");
        int[][] cube = new int[4][4];
        for(int i = 0; i < cube.length; i++){
            for(int j = 0; j < cube.length; j++){
                System.out.print(0 + "\t");
                if(j == i){
                    cube[i][j] = 1;
                    System.out.print(cube[i][j] + "\t");

                }
            }
            System.out.println("\n");

        }
        //Задание 6
        System.out.println("Задание 6");
        int[] checkBalance = {1, 1, 1, 2, 1,};
        int right = 0;
        int left = 0;


            for (int j = 3; j < checkBalance.length; ++j ) {
                right = right += checkBalance[j];

            }
            for (b = 0; b < checkBalance.length -2; b++) {
                if (b >= checkBalance.length - 2) {
                    System.out.println();
                } else if (b <= checkBalance.length - 2) {
                    left = left += checkBalance[b];

                }

            }
            if(right == left){
                System.out.print(true);
            }else {
                System.out.print(false);
            }
            System.out.println("\n");






        }






























    }





