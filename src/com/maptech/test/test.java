package com.maptech.test;

import java.lang.reflect.Array;
import java.util.Scanner;

import static java.lang.Math.acos;

 public class test {
    private static double distance;
   static void MethodTest()
    {

        Scanner obj = new Scanner(System.in);

        System.out.println("Input the first number ");
        int x = obj.nextInt();

        System.out.println("Input the second number");
        int y = obj.nextInt();

        System.out.println("Input the third number");
        int z = obj.nextInt();

        System.out.println("The result is: "+test_last_digit(x,y,z,true));


    }
    public static boolean test_last_digit(int p, int q, int r, boolean xyz )
    {
        return (p % 10 == q % 10 ) || (p % 10== r % 10 ) || (q % 10 == r % 10) ;
    }

    public static void methodAccept()
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input the first number :");
        int firstnumber = scn.nextInt();


        System.out.println("Input the first number :");
        int secondnumber = scn.nextInt();

        System.out.println("Input the first number :");
        int thirdnumber = scn.nextInt();

            System.out.println(result(firstnumber,secondnumber,thirdnumber));

    }
    public static boolean result(int a , int b , int c){
        if(b > a ){
            return true;
        }
        return c > b;

    }

    public static void distance_between_two_point()
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input the latitude of coordinate 1: ");
        double x1 = scn.nextDouble();

        System.out.println("Input the longitude of coordinate 1:");
        double y1 = scn.nextDouble();

        System.out.println("Input the latitude of coordinate 2: ");
        double x2 = scn.nextDouble();

        System.out.println("Input the longitude of coordinate 2: ");
        double y2 = scn.nextDouble();
//        System.out.println(calculatingTheRadius)
        System.out.print("The distance between those points is: " + calculatingTheRadius(x1, y1 , x2, y2) + " km\n");

        }

    public static double calculatingTheRadius(double x1, double y1, double x2, double y2) {

        x1 = Math.toRadians(x1);

        y1 = Math.toRadians( y1);

        x2 = Math.toRadians( x2 );

        y2 = Math.toRadians( y2);

        double  radius =  6371.01;
        return  distance = radius * acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));


    }

    public  static void  ParseMethod(){
            int x = Integer.parseInt("12");
            double c = Double.parseDouble("12");
            int b = Integer.parseInt("100",2);

            System.out.println(Integer.parseInt("12"));
            System.out.println(Double.parseDouble("12"));
            System.out.println(Integer.parseInt("100",2));
            System.out.println(Integer.parseInt("101",8));
    }

    public static void method52()
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input the first number");
        int firstnumber = scn.nextInt();

        System.out.println("Input the second number ");
        int secondnumber = scn.nextInt();

        System.out.println("Input the third number ");
        int thirdnumber = scn.nextInt();

        System.out.println(test.methodtest(firstnumber
                ,secondnumber,
                thirdnumber));


    }

    public static boolean methodtest(int a, int b, int c)
    {
        return ((a + b) == c || (b + a) == c || (c + a ) == b );
    }


    public static void methodOne(){
       Scanner scn = new Scanner(System.in);

      System.out.println("Input the first number ");
      int first_number = scn.nextInt();


      System.out.println("Input the second number :");
        int second_number = scn.nextInt();

      System.out.println("Input the third number :");
        int third_number = scn.nextInt();

        System.out.println(test.methodtest2(first_number,second_number,third_number,true));
     }
     public static boolean methodtest2(int x , int y , int z, boolean xyz)
     {
         if(xyz)
         {
             return  y > x;
         }
       return  (y > x) && (z > y);

     }
     public static void MethodMathRandom()
     {

         Scanner scn= new Scanner(System.in);
         System.out.println("Enter any random number");
         int random_number = scn.nextInt();

         int x =  (int) (Math.random() * 10);

         if(random_number == x){
             System.out.println("You have picked the correct digit" + x);

         }else{
             System.out.println("YOU HAVE PICKED THE WRONG DIGIT\t" +"the right digit is:\t"+ x);
         }

     }
     public static void concatenatetest(){
//         String word[];
//         String PemultimateWord;
//         Scanner scn = new Scanner(System.in);
//
//            System.out.println("The quick brown fox jumps over the lazy dog.");
//             word = scn.hasNext();
//
//
//
//      for(int x = 0; x < s.l; x++){
//          System.out.println();
//      }


//       System.out.println(hel.length);
     }

//     public static void methodloop()
//     {
//         String  [] amount = {"what is the key to a happy family life"}
//         for(int x = 0; x < amount.length; x ++) {
//             System.out.println(amount.);
//
//         }
//
//     }


}
