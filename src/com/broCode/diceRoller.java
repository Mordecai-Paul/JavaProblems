package com.broCode;

import java.util.Random;
import java.util.Scanner;

   /*  Local declared inside a method
          visible only to that method.

          global = declared outside a method, but within
          a class visible to all parts of a class
          */

public class diceRoller {
    diceRoller(){
        Random random = new Random();
       // int ran = random.nextInt() * 10;
        final int number = 0;
        roll(random, number);
    }
    void roll(Random random,int number){
         number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}

 class diceRoller2 {
    Random random;
    int number = 0;

    diceRoller2(){
       random = new Random();
        rolling(random, number);
    }
    void rolling(Random random,int number){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}

