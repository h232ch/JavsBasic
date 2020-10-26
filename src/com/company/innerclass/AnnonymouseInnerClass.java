package com.company.innerclass;

public class AnnonymouseInnerClass {

    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable(int i){
        int localNum = 100;

        return new Runnable() {
            @Override
            public void run() {
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
                System.out.println("runnable");
            }
        };
    }
}
