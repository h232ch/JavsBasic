package com.company.innerclass;

public class InstanceInnerClass { // 람다에서는 익명내부클래스가 구현되어 리턴함

    private int num = 10;
    private static int sNum = 20;
    private InnerClass innerClass; //InnerClass 타입으로 변수를 만듦

    public InstanceInnerClass(){
        innerClass = new InnerClass();
    }

    private class InnerClass{
         int inNum = 200;
//        static sInNum = 100; // Static은 인스턴스 생성과 상관없이 생성되고 호출되기 때문에 InnerClass에서 사용 불가함
         void inTest(){
            System.out.println(num);
            System.out.println(sNum);

        }
//        static void sTest(); // Static은 인스턴스 생성과 상관없이 생성되고 호출되기 때문에 InnerClass에서 사용 불가함
    }

    public void usingInTest(){
        innerClass.inTest();
    }
}
