package com.library.src;

public class SecondLargest {
    public static void main(String[] args) {
        int myArr[]= {-2,-1};
        int max= Integer.MIN_VALUE;
        int secLarg=Integer.MIN_VALUE;
        for(int i=0;i< myArr.length;i++){
            if(myArr[i]>max){
                secLarg=max;
                max=myArr[i];
            }
            else if(secLarg==Integer.MIN_VALUE){
                secLarg=myArr[i];
            }
            else if(myArr[i]>secLarg)
                secLarg=myArr[i];
        }
        System.out.println(max);
//        for(int i:myArr){
//            if(i!=max){
//                if(i>secLarg){
//                    secLarg=i;
//                }
//            }
//
//        }

        System.out.println(secLarg);
    }
}
