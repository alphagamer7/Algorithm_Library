package com.library.src;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        int fIndex =0;
        int lIndex=text.length()-1;
        boolean flag = true;
        while (fIndex<lIndex){
            if(text.charAt(fIndex)!=text.charAt(lIndex))
            flag=false;

            fIndex++;
            lIndex--;
        }
        System.out.println(flag);


    }


}
