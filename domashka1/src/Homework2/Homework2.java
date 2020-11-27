package Homework2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {
        number1();
        number2();
         number3();
        number4();
        number5();

    }

    private static void number5() {


        int[] arr5 = {5,7,7,4,2,8,5,4,12,7,9};
        int a=0;
        int b=99999;//не придумал какое задать значение
        int c =0;
        int d = 0;
        for(int i = 0 ; i < arr5.length;i++){
            if (arr5[i] > a){
                a = arr5[i];
                c = i;
            }
            if ( arr5[i] < b){
                b = arr5[i];
                d = i;
            }

        }
        System.out.println((b +" минимальное индекс " + d)+" ;" +  (a + " максимальное индекс "+c ) );
    }

    private static void number4() {
        int size =5;
        int n =1;
        int [][] arr4 = new int[size][size];
        for(int i = 0 ; i < size;i++) {

            for (int j = 0; j < size; j++) {
                if (i ==j ){ arr4[i][j]=1; }
                arr4[i][size-i-1]=1;

                System.out.printf("%2d ", arr4[i][j]);

            }

            System.out.println();
        }
    }
    //ниже решение подходит только к массиву 5 на 5 ,но лучше решения я не придумал(понимаю что скорее всего не правильно,но результат имеется
        /*final int size =5;
        int n =1;
        int [][] arr4 = new int[size][size];
        for(int i = 0 ; i < size;i++) {
            for (int j = 0; j < size; j++) {

                if (i == j || j == 4 && i ==0|| j == 0 && i ==4 || j == 1 && i ==3||j == 3 && i ==1){ arr4[i][j]=n;}


                System.out.printf("%2d ", arr4[i][j]);
            }
            System.out.println();

        }*/

    //ниже совсем глупое решение, но все же результат такой,как должен быть
        /*final int size =5;
        int n =1;
        int [][] arr4 = new int[size][size];

        for(int i = 0 ; i < size;i++) {
            for (int j = 0; j < size; j++) {

                        arr4[i][j]= n;

                System.out.printf("%2d ", arr4[i][j]);
            }
            System.out.println();

        }

    }*/

    private static void number3 (){
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0 ; i < arr3.length;i++){
            if(arr3[i] < 6 ){ arr3[i] *=2 ;}
            else continue;


        }System.out.println(Arrays.toString(arr3));

    }

    private static void number2() {

        /*int[] arr2 = new int[8];
        arr2[0] = 0;
        for (int i = 1;i<arr2.length;i++) {
            arr2[i] += 3*i ;


        }
        System.out.println(Arrays.toString(arr2));*/
        int[] arr2 = new int[8];

        for (int i = 0 , j = 3 ;i<arr2.length;i++) {
            arr2[i] += i*j;

        }
        System.out.println(Arrays.toString(arr2));

    }

    private static void number1() {
        int[] arr = {0,1,0,0,1,0,1,1,0};
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == 0){ arr[i] = 1 ;}
            else {arr[i]=0;}


        }System.out.println(Arrays.toString(arr));
    }


}

