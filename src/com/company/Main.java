package com.company;

import com.company.lambda.MyNumber;
import com.company.lambda.PrintString;
import com.company.lambda.StringConcat;
import com.company.lambda.StringContactImpl;
import com.company.stream.CompareString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // ArrayTest
        /*
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(101,"sh");
        Member member2 = new Member(102,"th");
        Member member3 = new Member(103,"wa");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);

        memberArrayList.showAll();
        memberArrayList.removeMember(member1.getMemberId());
        memberArrayList.showAll();
        */


        // StackTest (Last In First Out)
        /*
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
         */

        // QuereTest (First In First Out)
        /*
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        */

        // HashSetTest
        /*
        HashSet<String> set = new HashSet<String>();
        boolean b1 = set.add("A");
        System.out.println(b1);
        set.add("B");
        set.add("C");
        System.out.println(set);
        boolean b2 = set.add("A"); // duplicated element is not permit
        System.out.println(b2);
        System.out.println(set);

        MemberHashSet memberHashSet = new MemberHashSet(); // 데이터가 입력되는 순서와 출력되는 순서는 다르다

        Member member1 = new Member(1,"sh");
        System.out.println(member1.hashCode());
        Member member2 = new Member(2,"ad");
        Member member3 = new Member(3,"df");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        Member member4 = new Member(1,"sh"); //
        System.out.println(member4.hashCode());
        memberHashSet.addMember(member4);

        memberHashSet.showAll();
         */

        // TreeSet
        /*
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member member1 = new Member(1,"shfdfsd");
        Member member2 = new Member(2,"dhdfsdfds");
        Member member3 = new Member(3,"chadfsa");
        Member member4 = new Member(4,"11chadfsa");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.addMember(member4);

        memberTreeSet.showAll();
        */

        // HashMap  가장 많이 사용하는 Key-Value pair 배열
        /*
        MemberHashMap hashMap = new MemberHashMap();

        Member member1 = new Member(1,"shfdfsd");
        Member member2 = new Member(2,"dhdfsdfds");
        Member member3 = new Member(3,"chadfsa");
        Member member4 = new Member(4,"11chadfsa");

        hashMap.addMember(member1);
        hashMap.addMember(member2);
        hashMap.addMember(member3);
        hashMap.addMember(member4);

        hashMap.showAll();

        hashMap.removeMember(2);
        hashMap.showAll();

        MemberTreeMap treeMap = new MemberTreeMap();

        treeMap.addUser(member1);
        treeMap.addUser(member2);
        treeMap.addUser(member3);
        treeMap.addUser(member4);

        treeMap.showAll();
        */

        // InstanceInnerClass

        /*
        InstanceInnerClass instanceInnerClass = new InstanceInnerClass();
        instanceInnerClass.usingInTest(); // public 접근자를 이용하여 InnerClass의 Method 사용

//        InstanceInnerClass.InnerClass innerClass = instanceInnerClass.new InnerClass(); // InnerClass 인스턴스 생성 방법

        // StaticInnerClass
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.usingInTest();

        StaticInnerClass.InStaticClass.sTest();
        staticInnerClass.usingStaticInnerMethod();


        // LocalInnerClass
        LocalInnerClass localInnerClass = new LocalInnerClass();
        Runnable runnable = localInnerClass.getRunnable(20);
        runnable.run();

        // AnnonymouseInnerClass

        AnnonymouseInnerClass annonymouseInnerClass = new AnnonymouseInnerClass();
        annonymouseInnerClass.getRunnable(40).run();

        */

        // Lambda

        MyNumber maxNum = (x, y) -> (x >= y) ? x : y; // Interface의 구현을 람다식 + 삼항연산자로 구현
        int max = maxNum.getMaxNumber(10, 20); // 구현한 인스턴스를 이용하여 함수 호출
        System.out.println(max); // max의 결과값에 구현한 함수의 결과값이 존재함

        MyNumber aaa = new MyNumber() { // 위 람다식은 자바에서 익명 클래스가 생성되는 과정과 동일하다
            @Override
            public int getMaxNumber(int num1, int Num2) { // (x, y)->(x>=y)? x:y;
                return num1 + Num2;
            }
        };
        System.out.println(aaa.getMaxNumber(10, 20));

        StringConcat stringConcat = new StringContactImpl(); // 일반적인 객체지향 구현체 생성 후 사용
        // 구현해 놓고 계속 사용이 필요한 경우 객체로 생성하여 사용
        // 여러 인터페이스 임플리먼츠 하거나 하나의 추상클래스를 상속받아 사용할 수 있음
        stringConcat.makeString("hello", "java");

        StringConcat stringConcatLambda = (s1, s2) -> System.out.println(s1 + "," + s2); // Lambda로 구현체 생성 후 사용
        // 한번 구현하고 사용하는 경우 람다 or 익명클래스로 생성하여 사용
        // 하나의 메서드만 구현할 수 있음
        stringConcatLambda.makeString("hello", "java");

        StringConcat stringConcatInner = new StringConcat() { // 익명클래스로 구현체 생성 후 사용
            // 한번 구현하고 사용하는 경우 람다 or 익명클래스로 생성하여 사용
            // 하나의 인터페이스, 추상클래스만 선택하여 사용할 수 있음
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "," + s2);
            }
        };
        stringConcatInner.makeString("hello", "java");


        PrintString printString = str -> System.out.println(str); // 익명클래스가 생성되며 내부 함수는 람다식으로 구현됨
        printString.showString("Lambda");
        showMyString(printString);

        PrintString reStr = returnPrint();
        reStr.showString("hello");


        // Stream

        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr); // arr 배열을 스트림으로 생성
        int sum = stream.sum(); // 생성한 스트림에 sum 함수 실행
        System.out.println(sum); // sum 출력

        int count = (int) Arrays.stream(arr).count();
        System.out.println(count);

//        int count = (int)stream.count();
//        System.out.println(count); // 에러발생 이미 연산이 종료된 스트림은 -> 사라짐

        List<String> sList = new ArrayList<>();
        sList.add("tomas1");
        sList.add("tomas2");
        sList.add("tomas3");
        sList.add("tomas0");

        Stream<String> stream1 = sList.stream();
        stream1.forEach(s -> System.out.println(s)); // 스트림을 람다식을 사용하여 출력

        for(String s : sList) {
            System.out.println(s);  // for 문을 사용하여 출력
        }

        sList.stream().sorted().forEach(s-> System.out.println(s)); // sList를 스트림객체로 받고 정령하여 람다식으로 뽑아냄


        // Stream Reduce
        String[] greetings = {"Hi~", "Hello", "Good Morning", "NiHao~"}; // 가장 긴 문자열을 찾고싶다면?
        System.out.println(Arrays.stream(greetings).reduce("",(s1,s2) -> { // Lambda
            if(s1.getBytes().length >= s2.getBytes().length){
                return s1;
            }else {
                return s2;
            }
        }));

        System.out.println(Arrays.stream(greetings).reduce("", new CompareString()));
        // 객체로 구현하여 바이너리오퍼레이션을 구현 (실제는 바이너리오퍼레이션의 apply를 구현하여 사용
    }

    public static void showMyString(PrintString lambda){ // 람다식으로 구현된 객체가 넘어옴
        lambda.showString("Lambda2");
    }

    public static PrintString returnPrint(){
        return str -> System.out.println(str +" world"); // 익명클래스가 생성되며 내부 함수는 람다식으로 구현됨 (객체 타입은 PrintString 타입이다)
    }

    public static PrintString returnPrintInner(){ // 리턴 타입을 익명클래스로 생성하고 내부함수를 구현함
        return new PrintString() {
            @Override
            public void showString(String str) {
                System.out.println(str + " world");
            }
        };


    }



}
