package com.library.src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BracketFill {
    public static void main(String[] args) {
        Deque<Character> stack1 = new ArrayDeque<>();
//        stack1.push("test");
//        stack1.push("test2");
//        System.out.println(stack1.toString());
//        stack1.pop();
//        System.out.println(stack1.toString());
        String para="())";
        boolean flag = true;
        for(int i=0;i<para.length();i++){
            if((para.charAt(i)=='(')||(para.charAt(i)=='(')||(para.charAt(i)=='{')) {
                stack1.push(para.charAt(i));
            }
            else if((para.charAt(i)==']')||(para.charAt(i)==')')||(para.charAt(i)=='}')){
             if(stack1.isEmpty()||stack1.peek()!='('){
                 flag=false;
             }
             else {
                 stack1.pop();
             }
                }


            }
        System.out.print(flag);
        }




    }

