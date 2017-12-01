package com.library.src;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int myArr[] = new int[num];


        for (int i = 0; i < num; i++) {
            myArr[i] = in.nextInt();
        }

        int count = 0;
        int temp = 0;
        int lastSorted = myArr.length - 1;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastSorted; i++) {
                if (myArr[i] > myArr[i + 1]) {
                    temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = temp;
                    count++;
                    isSorted = false;
                }

            }
            lastSorted--;
        }

//        for(int i:myArr)
//        System.out.print(i);
//
//    }
        System.out.println("Array is sorted in "+ count +" swaps.");
        System.out.println("First Element: "+myArr[0]);
        System.out.println("Last Element: "+myArr[num-1]);
    }
}
