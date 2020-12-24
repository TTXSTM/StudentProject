package Lesson03.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class XO {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();


    public static  void  initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }

    }
    public static void printMap(){
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++){
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y>= SIZE) return true;
        return map[y][x] != DOT_EMPTY;
    }

    public static void humanTurn(){
        int x, y;
        do{
            System.out.println("Введите координаты в формате X Y: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn(){
        int x, y;
         humanTurn();
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellValid(x, y));

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;

    }
        public static boolean checkWin (char symb) {
            for (int i = 0; i <= SIZE -3; i++) {
                for (int j = 0; j <= SIZE -3; j++) {
                    if (map[i][j] == symb && map[i][j + 1] == symb && map[i][j + 2] == symb && map[i][j + 3] == symb) return true;
                    if (map[i][j] == symb && map[i + 1][j] == symb && map[i + 2][j] == symb && map[i + 3][j] == symb) return true;
                    if (map[i][j] == symb && map[i + 1][j + 1] == symb && map[i + 2][j + 2] == symb && map[i + 3][j + 3] == symb) return true;

                    }



                }
             return false;


            }




    public static void main(String[] args){
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;

            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }
}
