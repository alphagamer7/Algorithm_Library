package com.pluralsight.datastruct;

public class BasicStack<X> {
    private X []data;
    private int stackPointer;

    public BasicStack() {
       data = (X[])new Object[1000];
       stackPointer=0;

    }

    public void push(X newItem ){
        data[stackPointer++]=newItem;
    }

    public X pop(){
        if(stackPointer==0){
            throw new IllegalStateException("Stack is EMPTY");
        }

        return data[--stackPointer];
    }

    public boolean contains(X item){
        boolean found =false;
        for (int i=0;i<stackPointer;i++){
            if(data[i].equals(item)){
                found=true;
                break;
            }
        }
        return found;

    }
    public X access(X item){
        while(stackPointer>0){
             X tmpItem = pop();
             if(item.equals(tmpItem)){
                 return tmpItem;
             }

        }
        throw new IllegalArgumentException("Couldnot find item on Stack"+item);
    }

    public int size(){
        return stackPointer;
    }

}
