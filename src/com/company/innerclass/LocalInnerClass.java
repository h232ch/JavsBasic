package com.company.innerclass;

public class LocalInnerClass {

    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable(int i){
        final int localNum = 100;
        class MyRunnable implements Runnable{
            @Override
            public void run() {

//                localNum += 100; // 오류 발생 ( Runnable 타입의 메서드 호출시 지역변수는 Stack에 쌓이고 호출 종료시 사라진다.
//                위 상황에서 run()을 실행하여 localNum을 참조한다면 해당 변수는 이미 호출을 끝내고 사라진 상태일 수 있기에
//                지역 변수를 이너클래스에서 사용 불가함, 메서드 내부 클래스에서 사용하는 변수는 상수화된다 (이유 메서드 호출 뒤에도 이너클래스에서 계속 참조해야 하기 때문)
//                그래서 읽기는 가능하지만 쓰기는 불가능함

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }
        return new MyRunnable();
    }
}
