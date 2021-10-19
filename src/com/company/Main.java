package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.*;

class Exercise1 {
    public static void method1() {

        System.out.println("Hello World");
    }

    public static void method2() {
        int a, b, answer;
        a = 73;
        b = 30;
        answer = a + b;
        System.out.println(answer);

    }

    public static void method3() {
        int a, b, answer;
        a = 50;
        b = 3;
        answer = a / b;
        System.out.println(answer);

    }

    public static void method4() {
        int a = -5 + 8 * 6, b = (55 + 9) % 9,
                c = 20 + -3 * 5 / 8,
                d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void method5() {
        int firstnumber, secondnumber, answer;

        Scanner scn = new Scanner(System.in);

        System.out.println("Please input first number");
        firstnumber = scn.nextInt();

        System.out.println("please input second number");
        secondnumber = scn.nextInt();

        answer = firstnumber + secondnumber;
        System.out.println("The sum is:\t" + answer);

    }

    public static void method6() {
        int firstnumber, secondnumber;

        Scanner scn = new Scanner(System.in);

        System.out.println("Input first number");
        firstnumber = scn.nextInt();

        System.out.println("Input second number");
        secondnumber = scn.nextInt();

        System.out.println(
                "Answers \n" +
                        (firstnumber + secondnumber) + "\n" +
                        (firstnumber - secondnumber) + "\n" +
                        (firstnumber * secondnumber) + "\n" +
                        (firstnumber / secondnumber) + "\n" +
                        (firstnumber % secondnumber)
        );
    }

    public static void method7() {
        int firstnumber = 8;

        for (int x = 0; x < 10; x++) {
            System.out.println(firstnumber * x);

        }

    }

    public static void method8() {
        System.out.println("J    a   v     v  a                                                  \n" +
                "   J   a a   v   v  a a                                                 \n" +
                "J  J  aaaaa   V V  aaaaa                                                \n" +
                " JJ  a     a   V  a     a");

    }

    public static void method9() {
        double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }

    public static void method10() {
        double a = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(a);
    }

    public static void method11() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input the radius of a circle");
        double radius = scn.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The Perimeter is " + perimeter);
        System.out.println("The Perimeter is " + area);
    }

    public static void method12() {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first number");
        int firstnumber = scn.nextInt();

        System.out.println("enter second number");
        int secondnumber = scn.nextInt();

        System.out.println("enter third number");
        int thirdnumber = scn.nextInt();

        int answer = (firstnumber + secondnumber + thirdnumber) / 2;
        System.out.println("average number is " + answer);

    }

    public static void method13() {
        double area_of_a_rectangle;
        double perimeter_of_a_rectangle;

        double width = 5.5, height = 8.5;
        area_of_a_rectangle = width * height;
        perimeter_of_a_rectangle = 2 * (5.6 + 8.5);

        System.out.println("area is  " + area_of_a_rectangle);
        System.out.println("area is  " + perimeter_of_a_rectangle);
    }

    public static void metho14() {
        System.out.println("* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================");
    }

    public static void method15() {
        int a = 1, b = 2, c = 3;
        a = b;
        b = c;
        c = a;
        System.out.println((a));
        System.out.println(b);
        System.out.println(c);
    }

    public static void method16() {
        System.out.println("+\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+\n");
    }

    public static void method17() {
        int first_binary_number;
        int second_binary_number;
        String product;


        Scanner scn = new Scanner(System.in);


        System.out.println("input first binary number");
        first_binary_number = scn.nextInt();

        System.out.println("input second binary number");
        second_binary_number = scn.nextInt();

        product = Integer.toBinaryString(first_binary_number
                + second_binary_number);
        System.out.println(product);
    }

    public static void method18() {
        short first_binary_number;
        short second_binary_number;
        String product;


        Scanner scn = new Scanner(System.in);


        System.out.println("input first binary number");
        first_binary_number = scn.nextShort();

        System.out.println("input second binary number");
        second_binary_number = scn.nextShort();

        product = Integer.toBinaryString(first_binary_number
                * second_binary_number);
        System.out.println(product);
    }

    public static void method19() {
        Scanner scn = new Scanner(System.in);

        System.out.println("input a decimal number");
        int firstnumber = scn.nextInt();

        String Product = Integer.toBinaryString(firstnumber);
        System.out.println(Product);
    }

    public static void method20() {
        Scanner scn = new Scanner(System.in);

        System.out.println("input a decimal number");
        int hexadecimal = scn.nextInt();

        String Product = Integer.toHexString(hexadecimal);
        System.out.println(Product.toUpperCase());
    }

    public static void method21() {
        Scanner scn = new Scanner(System.in);

        System.out.println("input a decimal number");
        int octal = scn.nextInt();

        String Product = Integer.toOctalString(octal);
        System.out.println(Product.toUpperCase());
    }

    public static void method22() {
        Scanner sc = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
    }

    public static void method23() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input a binary number");
        String firstnumber = scn.nextLine();

        int number = Integer.parseInt(firstnumber, 2);

        String answer = Integer.toHexString(number);
        System.out.println(answer.toUpperCase());

    }

    public static void method24() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input a binary number");
        String firstnumber = scn.nextLine();

        int number = Integer.parseInt(firstnumber, 2);

        String answer = Integer.toOctalString(number);
        System.out.println(answer.toUpperCase());

    }

    public static void method25() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input any octal number:");
        String FirstNumber = scn.nextLine();

        int answer = Integer.parseInt(FirstNumber, 8);

        String second = Integer.toString(answer);
        System.out.println("Equivalent decimal number:" + second);


    }

    public static void method26() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input any Octal number:");
        String OctalNumber = scn.nextLine();

        int answer = Integer.parseInt(OctalNumber, 8);

        String binaryNumber = Integer.toBinaryString(answer);
        System.out.println("Equivalent binary number:\t" + binaryNumber);


    }

    public static void method27() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a hexadecimal number: ");
        String FirstNumber = scn.nextLine();

        int answer = Integer.parseInt(FirstNumber, 8);
        String Octal = Integer.toHexString(answer);
        System.out.println("Equivalent hexadecimal number:" + Octal);
    }

    public static void method28() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Input a hexadecimal number: ");
        String firstnumber = scn.nextLine();

        int answer = Integer.parseInt(firstnumber, 8);
        String Octal = Integer.toBinaryString(answer);
        System.out.println("Equivalent hexadecimal number:" + Octal);

    }

    public static void method29() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input a hexadecimal number: ");
        String firstnumber = scn.nextLine();

        int answer = Integer.parseInt(firstnumber, 8);
        String Octal = Integer.toBinaryString(answer);
        System.out.println("Equivalent hexadecimal number:" + Octal);
    }

    public static void method31() {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.runtime.version")); //this two has problem.
        System.out.println(System.getProperty("java.class_path"));
    }

    public static void method32() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input first integer:\t");
        int firstNumber = scn.nextInt();


        System.out.println("Input second Integer:\t");
        int secondNumber = scn.nextInt();
        if (firstNumber != secondNumber) {
            System.out.println(firstNumber + "\t!=\t" + secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + "\t<\t" + secondNumber);
        }
        if (firstNumber <= secondNumber) {
            System.out.println(firstNumber + "\t<=\td" + secondNumber);
        }


    }

    public static void method33() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input an integer");
        long n = scn.nextLong();

        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);

    }


    public static void method34() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon");
        double s = scn.nextLong();

        double area_of_hexagon = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The Area of the hexagon is:" + area_of_hexagon);
    }


    public static void method35() {
        double answer;
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon: ");
        double n = scn.nextLong();

        System.out.println("Input the length of one of the sides:");
        double s = scn.nextLong();

        answer = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area is " + answer);

    }

    public static void method36() {

        double x1, y1;
        double x2, y2;


        Scanner scn = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1: ");
        x1 = scn.nextDouble();

        System.out.println("Input the longitude of coordinate 1 : ");
        y1 = scn.nextDouble();

        System.out.println("Input the longitude of coordinate 2 : ");
        x2 = scn.nextDouble();

        System.out.println("Input the longitude of coordinate 2 : ");
        y2 = scn.nextDouble();

        System.out.println("The distance between those points is:" + Exercise1.methodTest(x1, y1, x2, y2) + "km");
    }

    public static double methodTest(double x1, double y1, double x2, double y2) {
        double radius = 6371.01;

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        return radius * Math.acos(Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }

    public static void method37() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a string:");
        String reverseSentence = scn.nextLine();

        StringBuffer obj = new StringBuffer(reverseSentence);
        System.out.println(obj.reverse());

    }

    public static void method38() {
        System.out.println("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");

        String sentence = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] word = sentence.toCharArray();

        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int x = 0; x < word.length; x++) {
            if (Character.isLetter(letter)) {
                letter++;
            }
        }
        System.out.println(letter);
    }

    public static void method39() {
        int amount = 0;
        for (int x = 0; x <= 4; x++) {
            for (int y = 0; y <= 4; y++) {
                for (int z = 0; z <= 4; z++) {
                    System.out.println(x + "" + y + "" + z);
                    amount++;
//                        if (x != y && z != x && z != y) {
//                            amount++;
//                            System.out.println(x + "" + y +"" + z);
//
//                        }

                }


            }
        }
        System.out.println("Total number of the three-digit-number is" + amount);

    }

    public static void method40() {
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);


        }
    }

    public static void method41() {
//            checking the ascii value.
        int ch1 = 'Z';
        System.out.println(ch1);


    }

    public static void method42() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your password");
        String password = scn.nextLine();

        System.out.println("Your password was: " + password);

    }

    public static void method43() {
        System.out.println("Twinkle, twinkle, little star,\n" +
                "\tHow I wonder what you are! \n" +
                "\t\tUp above the world so high,   \t\t\n" +
                "\t\tLike a diamond in the sky. \n" +
                "Twinkle, twinkle, little star, \n" +
                "\tHow I wonder what you are");
    }

    public static void method44() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a number");
        int fristnumber = scn.nextInt();
        System.out.println(fristnumber + "+ " + (fristnumber + "" + fristnumber) + "+ " + (fristnumber + "" + fristnumber + "" + fristnumber));
    }

    public static void method45() {
        File obj = new File("/home/ubercipherx/Downloads/test");
        File obj2 = new File("/home/ubercipherx/Downloads/test2");
        System.out.println(obj.length() + " bytes");
        System.out.println(obj2.length() + " bytes");


    }

    public static void method46() {
        System.out.println("Current Date time:" + System.currentTimeMillis());
    }

    public static void method47() {
        System.out.format("");
    }

    public static void method48() {


        for (int x = 0; x <= 99; x++) {
            if (x % 1 == 0) {
                System.out.println("odd number from 1- 99 is : \t" + x);
            }
        }
    }


    public static void method49() {

        System.out.println("Please Input a number");

        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();


        if (number % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static void method50() {
        for (int x = 0; x < 101; x++) {

            if (x % 3 == 0) {
                System.out.print("Divided by 3:\t");
                System.out.println(x);

            }

        }
        System.out.println();
        for (int x = 0; x < 100; x++) {
            if (x % 5 == 0) {
                System.out.print("Divided by 5:\t");
                System.out.println(x);
            }
        }
        System.out.println();

        for (int x = 0; x < 100; x++) {
            if ((x % 3) == 0 && (x % 5) == 0) {
                System.out.print("Divided by 3 and 5:\t");
                System.out.println(x);
            }
        }
    }

    public static void method51() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input a number(string): \t");
        String number = scn.nextLine();

        int answer = Integer.parseInt(number);
        System.out.println("The integer value is:" + answer);


    }

    public static void method53() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input the first number:\t");
        int FirstNumber = scn.nextInt();

        System.out.println("Input the second number:\t");
        int SecondNumber = scn.nextInt();

        System.out.println("Input the first number:\t");
        int ThirdNumber = scn.nextInt();

        System.out.println(Exercise1.method53testOne(FirstNumber, SecondNumber, ThirdNumber));
    }

    public static boolean method53testOne(int x, int y, int z) {
        if (x + y == z)
            return true;
        else return false;
    }

//        public static void method53() {
//            Scanner scn = new Scanner(System.in);
//
//            System.out.println("Input the first number :");
//            int FirstNumber = scn.nextInt();
//
//            System.out.println("Input the second number :");
//            int SecondNumber = scn.nextInt();
//
//            System.out.println("Input the third number :");
//            int ThirdNumber = scn.nextInt();
//
//            System.out.println(Exercise1.method53test(
//                    FirstNumber,
//                    SecondNumber,
//                    ThirdNumber));
//
//
//        }
//        public static boolean method53test(int x , int y , int z)
//        {
//          int answer =   x + y ;
//
//            if(answer == z)
//                return true;
//           else return false;
//        }

    public void method54() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter any Integer(seconds)");
        double totalSecs = scn.nextInt();


        double hours = totalSecs / 3600;
        double minutes = (totalSecs % 3600) / 60;
        double seconds = totalSecs % 60;

        System.out.println(Math.round(hours) + ":" + Math.round(minutes) + ":" + Math.round(seconds));


    }

    public static void method55() {

    }

    public static void method56() {
        Scanner scn = new Scanner(System.in);

        int x = 5;
        int y = 50;
        int p = 3;
        System.out.println(Exercise1.method56(x, y, p));
    }

    public static int method56(int x, int y, int p) {
        if (x % p == 0)

            return (y / p - x / p + 1);
        return (y / p - x / p);
    }

    public static void method57() {

    }

    public static void method58() {
//        {
//            Scanner scn = new Scanner(System.in);
//            System.out.println("Input a Sentence:");
//            String person = scn.nextLine();
//
//           String [] answer =  person.split(" ");
//
//
//            for(int x =0; x < answer.length;  x++)
//              {
//                  System.out.print(" " +answer[x].substring(0,1).toUpperCase() + answer[x].substring(1) );
////                break;
//              }
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a Sentence");
        String word = scn.nextLine();

        String sentence[] = word.split(" ");

        for (int x = 0; x < sentence.length; x++) {
            System.out.print(" " + sentence[x].substring(0, 1).toUpperCase() + sentence[x].substring(1));
        }


    }

    public static void method59() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input a String");
        String word = scn.nextLine();

        String x = word.toLowerCase();

        System.out.println(x);

    }

    public static void method60() {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a Sentence");
        String line = input.nextLine();

        String[] words = line.split("[ ]+");

        System.out.println("Penultimate Word:" + words[words.length - 2]);

    }

    public static void method61() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input a word:");
        String sentence = scn.nextLine();

        StringBuffer obj = new StringBuffer(sentence);

        StringBuffer x = obj.reverse();

        System.out.println(x);

    }

    public static void method62() {
        Scanner scn = new Scanner(System.in);


        System.out.println("Input the first number :");
        int x = scn.nextInt();

        System.out.println("Input the second number :");
        int y = scn.nextInt();

        System.out.println("Input the third number :");
        int z = scn.nextInt();
        System.out.println(Exercise1.method62(x, y, z));
    }

    public static boolean method62(int x, int y, int z) {
//            if(x  == 20|| x >20 - x -(y + z))
        return true;
//            if(x > 20 || y > 20 || z >20 )
//                return true;


//                return true;

    }

    public static void method63() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number");
        int FirstNumber = scn.nextInt();

        System.out.println("Enter second number");
        int SecondNumber = scn.nextInt();

        System.out.println(method63Test(FirstNumber, SecondNumber));

    }

    public static int method63Test(int x, int y) {
        if (x == y)
            return 0;
        if (x % 6 == y % 6)
            return (x < y) ? x : y;
        return (x > y) ? x : y;

    }

    public static void method64() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the first number");
        int FirstNumber = scn.nextInt();

        System.out.println("Input the second number");
        int SecondNumber = scn.nextInt();

        System.out.println(Exercise1.
                method64Test(FirstNumber,
                        SecondNumber));
    }

    public static boolean method64Test(int p, int q) {
        if (p < 25 || q > 75)
            return false;
        int x = p % 10;
        int y = q % 10;

        p = p / 10;
        q = q / 10;

        return (p == q || p == y || x == q || x == y);

    }

    public static void method65() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter first number");
        int FirstNumber = scn.nextInt();

        System.out.println("Please enter second number");
        int SecondNumber = scn.nextInt();

        int divison = FirstNumber / SecondNumber;

        int result = FirstNumber - (divison * SecondNumber);

        System.out.println(result);
    }

    public static void method66() {

    }

    public static void method67() {
        String main_String = "Python 3.0";
        String word = "Tutorial";
        System.out.println(main_String.substring(0, 7) + word + main_String.substring(6));
    }

    public static void method68() {

    }

    public static void method69() {
        String word = "Python";
        System.out.println(word.substring(0, 3));
    }

    public static void method70() {
        String str1 = "Python";
        String str2 = "Tutorial";

        System.out.println("sample output "
                + str1.concat(str2) + str1);

//            String str1 = "Python";
//            String str2 = "Tutorial";
//
//            if(str1.length() >= str2.length())
//                System.out.println(str2 + str1 + str2);
//            else
//                System.out.println(str1 + str2 + str1);
    }

    public static void method71() {
        String firstString = "Python";
        String secondString = "Tutorial";

        System.out.println(firstString.substring(1)
                + secondString.substring(1));
    }


    public static void method72() {
        String str1 = "";
        int len = str1.length();

        if (len >= 3)
            System.out.println(str1.substring(0, 3));

        else if (len == 1)
            System.out.println(str1.charAt(0) + "##");
        else
            System.out.println("###");
    }

    public static void method73() {
//         String str1 = "Python";
//         String str2 = "";


    }

    public static boolean method74() {
        int array[] = {10, -20, 0, 30, 40, 60, 10};

        return (
                array.length >= 2 || array[0] == 10
                        || array[array.length - 1] == 10
        );

    }

    public static boolean method75() {
        int array[] = {50, -20, 0, 30, 40, 60, 10};

        return (
                array.length >= 2 || array[0] == array[array.length - 1]
        );
    }

    public static boolean method76() {

        int array1[] = {50, -20, 0, 30, 40, 60, 12};

        int array2[] = {45, 20, 10, 20, 30, 50, 11};

        return ((
                array1.length >= 2 && array2.length >= 2
                        || (array1[0] == array2[0])
                        || (array1[array1.length - 1] == array2[array2.length - 1])
        ));

    }

    public static String method77() {
        int array1[] = {50, -20, 0};
        int array2[] = {5, -50, 10};

        System.out.println("Array1:\t" + Arrays.toString(array1));
        System.out.println("Array1:\t" + Arrays.toString(array2));

        int NewArray[] = {array1[0], array2[2]};

        return "New array:\t" + Arrays.toString(NewArray);

    }

    public static boolean method78() {
        int OriginalArray[] = {5, 7};
        return (
                OriginalArray[0] == 4 || OriginalArray[OriginalArray.length - 1] == 7
                        &&
                        OriginalArray[1] == 4 || OriginalArray[OriginalArray.length - 1] == 7
        );
    }

    public static String method79() {
        int[] Original_Array = {20, 30, 40};

        int NewArray[] = {Original_Array[1], Original_Array[2], Original_Array[0]};
        return "Rotated Array:\t" + Arrays.toString(NewArray);
    }

    protected static OptionalInt methodTest() {
        int Original_Array[] = {1000, 17000, 80};

        System.out.println(Arrays.toString(Original_Array));
        return Arrays.stream(Original_Array).max();


    }

    //check method80 again!!!!
    protected static void method80() {
//        int[] array_nums = {90,10,40};
//
//        int n=0;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the number of elements in array");
//        n= input.nextInt();
//        int a[] = new int[n];
//        int max =a[0];
//        System.out.println("Enter the elements of array: ");
//        for (int i=0;i<n;i++){
//            a[i]="input.nextInt();"
//        }="" for="" (int="" j="0;j&lt;n-1;j++){" if="" (max=""> a[j]){
//        max=max;
//    }
//else{
//        max=a[j];
//    }
//    }
//System.out.println(max);


    }

    public static void method81() {
        int Original_Array[] = {20, 30, 40};
        int New_Array[] = {Original_Array[0], Original_Array[1], Original_Array[Original_Array.length - 1]};
        System.out.println(Arrays.toString(New_Array));
    }

    //method82 is trash please check on stackoverflow.
    public static void method82() {

        int[] array_nums = {5, 10, 9, 3, 7};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        int max_val = array_nums[0];
        if (max_val <= array_nums[array_nums.length - 1])

            max_val = array_nums[array_nums.length - 1];
        if (max_val <= array_nums[array_nums.length / 2])

            max_val = array_nums[array_nums.length / 2];

        System.out.println("Find the largest element between first, last, and middle values from an array of integers:\t" + max_val);
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Insert an Array:");
//            System.out.println("How many numbers will the Array contain(odd number): ");
//            int z = scanner.nextInt();
//            int [] main = new int [z];
//            int k = 1;
//            for ( int i = 0; i < main.length; i++ )
//            {
//                System.out.print("Number" + " " + k + ": ");
//                main [i] = scanner.nextInt();
//                k++;
//            }
//            int max = main[0];
//            if ( main[(main.length - 1) / 2] > max )
//            {
//                max = main[(main.length - 1) / 2];
//            }
//            if ( main[(main.length - 1)] > max )
//            {
//                max = main[(main.length - 1)];
//            }
//            System.out.println("Largest element between first, last, and middle" + max );
    }

    public static void method83() {
        int array1[] = {1, 3, -5, 4};
        int array2[] = {1, 4, -5, -2};
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2:" + Arrays.toString(array2));

        int Result[] = {
                (array1[0] * array2[0]),
                (array1[1] * array2[1]),
                (array1[2] * array2[2]),
                (array1[3] * array2[3]),
        };

        System.out.println("Results" + Arrays.toString(Result));
    }

    public static void method84() {

//        String string1 = "Python";
//        int slength = 3;
//        if (slength > string1.length()) {
//            slength = string1.length();
//        }
//        String subpart = string1.substring(string1.length()-3);
//        System.out.println(subpart + string1 + subpart);


        String x = "Python";
        String extraction = x.substring(3);
        System.out.println(extraction + x + extraction);
    }

    public static boolean method85() {
        String x = "Hello how are you?";
        if (x.startsWith("Hello"))
            return true;
        else
            return false;
    }

    //#redo this method.
    public static void method86() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer " +
                "which is even or odd ");
        int n = in.nextInt();
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                System.out.println("this is even\t" + n);
            }
            if (n % 1 == 0) {
                System.out.println("this is an odd number:\t" + n);
            }


        }
    }


    public static void method87() {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the sum of a digit.!!");
        int num = in.nextInt();

        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num /= 10;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Sum with english digits: " + printNumber(sum));
    }

    public static String printNumber(int sum) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String sum_str = "";
        while (sum > 0) {
            sum_str = numbers[sum % 10] + " " + sum_str;
            sum /= 10;
        }
        return sum_str;
    }


    public static void testmethod87() {

        int numb = 1234;
        int sum = 0;
        int digit = 0;
        while (numb != 0) {
            digit = numb % 10;//extracting the last digit in an integer.
            sum = sum + digit; //0 + 4;
            numb = numb / 10; //123

        }
        System.out.println("the sum of digit is " + sum);
    }

    public static void method88() {

//            );
        System.out.println("*********  System properties ********");

        System.out.println(
                System.getProperties()
        );
        System.out.println("*********  System environment ********");

        System.out.println(
                System.getenv()

        );
//            System.out.println(System.getenv());

    }

    public static void method89() {
        System.out.println("*********Security Manager ********");

        SecurityManager security = System.getSecurityManager();

    }

    public static void method90() {
        // gets the value of the specified environment variable "PATH"
        System.out.println("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));

        // gets the value of the specified environment variable "TEMP"
        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));

        // gets the value of the specified environment variable "USERNAME"
        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }

    public static void method91() {
        System.out.println("hello:\t" + System.nanoTime());
    }

    public static void method92() {
        // total number of things in an array..
        int x[] = {34, 5, 5, 6, 35, 35, 355, 2};
//           for(int x = 0; x )
        int even = 0;
        int odd = 0;
        for (int y = 0; y < x.length; y++) {
            if (x[y] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("the total number of even number:\t" + even);
        System.out.println("the total number of odd number:\t" + odd);

    }

    public static void method93() {

    }

}





    public class Main {

        public static void main(String[] args) {
            Exercise1 obj = new Exercise1();
            Exercise1.method93();


//            Exercise1 obj =new Exercise1();
//            obj.method53();


//                Exercise1 obj = new Exercise1();
//                Exercise1.method11();
//            test obj = new test();
//            test.MethodTest();


//
//            JavaArray obj2 = new JavaArray();
//            obj2.ForEachLoop();

//            int a[] = {45,5,3,3,5,55,12};
//            min(a);

//             anonymous method.
//            TestAnonymousArray(new int[]{34,56,6,7,3,3,5});

//             returning an Array.
//            int arr[] = get();
//
//            for(int x : arr)
//            {
//                System.out.println(x);
//            }

//            Array out of bound
//            JavaArray.ArrayIndexOutBoundException();


//          JavaArray.MultiDimensionalArray2();
//;
//


        }
    }








