package Homework4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    static final int Size = 3;

    static final char Dot_empty = '•';
    static final char Human = '1';
    static final char comp = '0';
    static char[][] map = new char[Size][Size];
    static final Scanner in = new Scanner(System.in);
    static final Random rand = new Random();
    static final String HeaderF = "♥";
    static final String empty = " ";


    public static void main(String[] args) {

        turnGame();
        playGame();
    }
    private static void turnGame() {
        initMap();
        printAllMap();
    }
    private static void initMap() {
        for(int i = 0;i<Size;i++){
            for (int j = 0 ; j < Size; j++){
                map [i][j]= Dot_empty;
            }
        }
    }
    private static void printAllMap() {
        printmap();
        stringmapRoll();
    }

    private static void printmap() {
        System.out.print(HeaderF + empty);
        for (int i = 0 ;i <Size ; i++){
            printStrNum(i);
        }
        System.out.println();
    }
    private static void printStrNum(int i) {
        System.out.print(i + 1 + empty);
    }
    private static void stringmapRoll() {



        for (int i = 0; i < Size; i++) {
            printStrNum(i);
            for (int j = 0; j < Size; j++) {
                System.out.print(map[i][j] + empty);
            }
            System.out.println();

        }

    }
    private static void playGame() {
        while (true){


            humanturn();
            printAllMap();
            checkEnd(Human);

            compTurn();
            printAllMap();
            checkEnd(comp);
        }
    }
    private static void humanturn() {
        int rowNum =0;
        int columnNum=0;
        do {


            System.out.println("\nход человека введите число от 1 до 3 ");

            System.out.print("строка ");
            if(in.hasNextInt()){
                rowNum = in.nextInt();
            }else {
                in.next();
                System.out.println("только числа от 1 до "+ Size + "\n");

                continue;
            }
            System.out.print("столбец ");
            if(in.hasNextInt()){
                columnNum = in.nextInt();
            } else {
                in.next();
                System.out.println("только числа от 1 до "+ Size + "\n");
            }

        }
        while (!isCellValid(rowNum ,columnNum));

        map[rowNum - 1][columnNum - 1] = Human;
    }

    private static boolean isCellValid(int rowNum, int columnNum) {
        return isCellValid(rowNum, columnNum,false);



    }
    private static boolean isCellValid(int rowNum, int columnNum,boolean isAI) {
        if ( !isAI && (rowNum < 1 || rowNum >Size || columnNum <1||columnNum>Size)){
            return false;
        }
        if (map [rowNum-1][columnNum-1] != Dot_empty){
            if (!isAI){
                System.out.println("\n занято");
            }
            return false;
        }
        return true;

    }



    private static void checkEnd(char symbol) {
        boolean isEnd = false;
        if (checkWin(symbol)){
            String WnMess;
            if (symbol == Human){
                WnMess = "победа человеков";
            }else WnMess = "человечество падет, увы и хорошего дня";
            isEnd = true;
            System.out.println(WnMess);
        }


        if (!isEnd && isMapFull()){
            System.out.println("ничья");
            isEnd= true;
        }
        if (isEnd) {
            System.exit(0);
        }

    }

    private static boolean checkWin(char symbol) {
        int a ;
        int b ;
        int c =0;
        int d =0;
        for (int i = 0; i < Size; i++) {
            a = 0;
            b = 0;

            for (int j = 0; j < Size; j++) {
                if (map[i][j] == symbol){
                    a++;
                    if (a==Size){
                        return true;
                    }
                }
                if (map[j][i]== symbol){
                    b++;
                    if (b == Size){
                        return true;
                    }

                }
            }
            if (map[i][i] == symbol ) {
                c++;
                if ( c == Size){
                    return true;
                }
            }
            if (map[i][Size-i-1]== symbol){
                d++;
                if (d == Size){
                    return true;
                }
            }




        }return false;

    }

    private static boolean isMapFull() {
        for (char[] chars : map){
            for (char symbol:chars){
                if (symbol == Dot_empty){
                    return false;
                }
            }
        }
        return true;


    }


    private static void compTurn() {
        int rowNum ;
        int columnNum;
        System.out.println("\nход компьютера\n");
        do {
            rowNum = rand.nextInt(Size)+1;
            columnNum = rand.nextInt(Size)+1;



        }while (!isCellValid(rowNum,columnNum,true));
        map[rowNum - 1][columnNum - 1] = comp;



    }











}

