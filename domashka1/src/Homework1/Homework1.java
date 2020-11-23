package Homework1;

public class Homework1 {
    public static void main(String[] args) {

        //System.out.println(number3(1,2,3,4));


        //System.out.println(number4(6 ,9 ));

        //number5(7);


        //System.out.println(number6(-9));

        //number7("Hren");

        //System.out.println(number8(2100));


    }

    private static boolean number8(int j) {
       /* if (j % 400 == 0 ){ return true;}
            else if (j % 100 == 0){ return false;}
            else if (j % 4 ==0 ){ return true;}
        else {return false;}*/
        return j%400==0 || j%100!=0 & j%4==0;

    }

    private static void number7(String z) {
        //String name = "Hren";
        String hi = "Hello dear " ;
        System.out.println(hi + z);




    }

    private static boolean number6(int h) {
        return h < 0;
    }

    private static void number5(int g) {
        if (g < 0) {
            System.out.println("отрицательное");
        }
        else {
            System.out.println("положительное");
        }
    }

    private static boolean number4(int e , int f){
        int eF = e + f;
        return eF <= 20 && eF >= 10;
    }

    private static double number3(int a,int b,int c,int d) {
      //  double a = 1.0;
      //  double b = 2.0;
       // double c = 3.0;
       // double d = 4.0;
        double res = a * (b + (1.0*c / d));
        return res;
    }

}
