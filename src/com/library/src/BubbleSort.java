package com.library.src;

public class BubbleSort {
    public static void main(String[] args) {
        int myArr[] = {7,3,1,9,5,4};
        int temp=0;
        int lastSorted=myArr.length-1;
        boolean isSorted=false;
        while(!isSorted) {
            isSorted=true;
            for (int i = 0; i < lastSorted; i++) {
                if (myArr[i] > myArr[i + 1]) {
                    temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = temp;
                    isSorted=false;
                }

            }
            lastSorted--;
        }
        for(int i:myArr)
        System.out.print(i);

    }
}
