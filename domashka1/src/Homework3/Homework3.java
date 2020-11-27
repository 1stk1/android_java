package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        game();
    }

    private static void game() {
        System.out.println("загадано число от 1 до 99 , за 5 попыток нужно угадать число ");

        Random random = new Random();
        int a = random.nextInt(99) + 1;

        for (int i = 0; i < 5;) {
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt() ;

            if (b > 99 || b < 1) {
                System.out.println("только от 1 до 99");
            }
            else if (b > a) {
                System.out.println("меньше");

            }
            else if (b < a) {
                System.out.println("больше");

            }

            else {
                System.out.println("winner, winner, chicken dinner");
                System.out.println("всего за " +(i + 1)+" попытки" );
                break;
            }
            i++;//вынес чтоб оно приняло значение 5 до окончания цикла, и обозначить проигрыш
            if (i >= 5){
                System.out.println("loser");
            }


        }
    }


}
