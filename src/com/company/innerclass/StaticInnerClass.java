package com.company.innerclass;

public class StaticInnerClass {
    private int num = 10;
    private static int sNum = 20;
    private StaticInnerClass.InnerClass innerClass; //InnerClass 타입으로 변수를 만듦

    public StaticInnerClass(){
        innerClass = new StaticInnerClass.InnerClass();
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

    public static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        private void inTest() {
//            num += 100; // 스태틱 내부 클래스에 인스턴스 변수는 사용할 수 없음 ( 스태틱이란 인스턴스 생성 유무와 관계없이 사용 가능해야 하기 때문 )
            sNum +=10; // 스태틱 내부 클래스에 스태틱 변수는 사용 가능 ( 인스턴스 생성 유무와 관계없이 사용 가능하기 때문 )
        }
        public static void sTest(){
            System.out.println(sNum);
            System.out.println(sInNum); // 여기서도 동일하게 스태틱 변수만 사용 가능
        }
    }

    public void usingStaticInnerMethod(){
        InStaticClass inStaticClass = new InStaticClass();
        inStaticClass.inTest();
    }
}
