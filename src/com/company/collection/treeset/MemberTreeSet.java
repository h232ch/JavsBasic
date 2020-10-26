package com.company.collection.treeset;

import com.company.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;
    public MemberTreeSet(){
        treeSet = new TreeSet<Member>(new Member()); // Compare 사용시 new Member 추가
    }

    public void addMember(Member member){
        treeSet.add(member);
    }
    public boolean removeMember(int memberId){
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            if(member.getMemberId() == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAll(){
        System.out.println(treeSet);
    }

}
