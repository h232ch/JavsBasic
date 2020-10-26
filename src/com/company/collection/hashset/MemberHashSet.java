package com.company.collection.hashset;

import com.company.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {



    private HashSet<Member> hashSet;
    public MemberHashSet(){
        hashSet = new HashSet<>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Member member = iterator.next();
            if(member.getMemberId() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println("Member is not found");
        return false;
    }

    public void showAll(){
        System.out.println(hashSet);
    }

}
