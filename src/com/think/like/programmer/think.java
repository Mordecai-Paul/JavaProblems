package com.think.like.programmer;

public class think {
        public static void main (String args[])
        {
         methodthink obj = new methodthink();
         obj.methodSquare();
        }
}

class methodthink {
    public static void methodSquare() {
        for(int row = 0; row  <=  5; row++){
            for(int column =0; column <= 6 - row; column++){
                System.out.print("###");
            }
            System.out.print("\n");
        }
    }
}


