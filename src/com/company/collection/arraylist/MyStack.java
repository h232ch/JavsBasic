package com.company.collection.arraylist;

import java.util.ArrayList;

public class MyStack {

    private ArrayList<String> arrayStack = new ArrayList<>();
    public void push(String data){
        arrayStack.add(data);
    }
    public String pop(){

        int len = arrayStack.size();
        if(len == 0){
            System.out.println("Data is empty");
            return null;
        }
        return arrayStack.remove(len-1);
    }
}
