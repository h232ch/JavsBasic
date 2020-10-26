package com.company.collection;

import java.util.Collection;
import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> { // 기본적으로 Comparable을 많이 사용

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public Member() { // Compare 함수를 사용하기 위해 Default Constructor를 만들어 줌
        
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }


    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override // hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값이다. (해당 코드는 memberId로 대체한다.)
    public int hashCode() {
        return memberId;
    }

    @Override // HashSet은 중복을 허용하지 않음으로 아래의 코드를 오버라이딩하여 사용
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member)obj;
            return this.memberId == member.memberId;
        }
        return false;
    }


    @Override
    public int compareTo(Member member) {
        return this.memberId - member.memberId; // 오름차순 (내가더 크면 양수, 작으면 음수 반환) -> 이진트리에서 부모노드를 기준으로 작으면 왼쪽 크면 오른쪽
//        return member.memberId - this.memberId; // 내림차순 (비교값이더 크면 양수, 작으면 음수 반환) -> 이진트리에서 부모노드를 기준으로 작으면 오른쪽 크면 왼쪽
//        return this.memberName.compareTo(member.memberName); // String에 구현되어있는 CompareTo로 memberName 기준 정렬
//        return (this.memberName.compareTo(member.memberName)) * (-1); // String에 구현되어있는 CompareTo로 memberName 기준 정렬
    }

    @Override
    public int compare(Member member1, Member member2) {
        return member1.memberId - member2.memberId; // 오름차순

    }
}
