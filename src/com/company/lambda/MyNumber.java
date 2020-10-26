package com.company.lambda;

@FunctionalInterface // 함수형 인터페이스 선언, 함수형 인터페이스에서는 1개의 메서드만 선언해야 함
public interface MyNumber {

    int getMaxNumber(int num1, int Num2);
//    void add();
}
