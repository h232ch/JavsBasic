package com.company.collection.hashmap;

import com.company.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;
    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        return false;
    }

    public void showAll(){
        Iterator<Integer> ir = hashMap.keySet().iterator(); // keySet을 호출하면 Key-Value Pair의 Set 형태의 배열이 호출되고 이를 Iterator로 반환함

        while (ir.hasNext()){
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
