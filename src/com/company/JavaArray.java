package com.company;

public class JavaArray {
    public void singleDimensionalArray() {
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 9;
        a[3] = 19;

        System.out.println(a[1]);
        System.out.println(a[2]);


    }

    public void InstantOfAnArray() {
        int a[] = {56, 5, 53, 3, 3, 5};
        System.out.println(a[0]);

    }

    public void loopingThroughAnArray() {
        int a[] = new int[5];
        a[0] = 4;
        a[1] = 3;
        a[2] = 4;
        a[3] = 3;
        a[4] = 4;


        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]);
        }
    }

    public void ForEachLoop() {
        int x[] = new int[10];
        x[0] = 4;
        x[1] = 4;
        x[2] = 9;
        x[3] = 5;
        x[4] = 6;
        x[5] = 4;
        x[6] = 9;
        x[7] = 4;
        x[8] = 4;
        x[9] = 4;

        for (int y : x) {
            System.out.println(y);
        }
    }

    //passing an array to a method.
    public static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            System.out.println(min);
        }

    }

    public static void TestAnonymousArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //    returning array from the method.
   public  static int[] get() {
        return new int[]{10, 30, 50, 90, 60};
    }

    public static boolean ArrayIndexOutBoundException() {
        int arr[] = {50, 60, 70, 80};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        return false;
    }


//    change i use for loop in a MultiDimensionalArray array?
   public static int MultiDimensionalArray()
   {
       int muti[][] = new int[5][ 6 ];
       muti[1][2] = 4;
       muti[2][3] =0;
       muti[4][5]=4;

        return muti[1][2];
   }
   public static void MultiDimensionalArray2(){
        int multimillionaire [][] ={{1,2,3},{2,4,5},{4,4,5}};
        for(int x  = 0; x < multimillionaire.length ; x++)
        {
            for (int i =0; i < multimillionaire.length; i++)
            {
                System.out.println(multimillionaire[x][i]+" ");
            }
            System.out.println();
        }
   }

}
