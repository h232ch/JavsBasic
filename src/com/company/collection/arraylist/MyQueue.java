package com.company.collection.arraylist;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();
    public void enQueue(String data){
        arrayQueue.add(data);
    }
    public String deQueue(){
        int len = arrayQueue.size();
        if(len ==0){
            System.out.println("Data is empty");
            return null;
        }
        return arrayQueue.remove(0); // FIFO
    }
}
