package com.company.collection.treemap;

import com.company.collection.Member;
import com.company.collection.treeset.MemberTreeSet;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    TreeMap<Integer, Member> treeMap;

    public MemberTreeMap(){
        treeMap = new TreeMap<>();
    }

    public void addUser(Member member){
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeUser(Member member){
        if(treeMap.containsKey(member.getMemberId())){
            treeMap.remove(member.getMemberId());
            System.out.println("Member id "+member.getMemberId()+" is removed");
            return true;
        }
        System.out.println("There is no member id");
        return false;
    }

    public void showAll(){
        Iterator<Integer> iterator = treeMap.keySet().iterator();
        System.out.println("KeySet shows this : "+treeMap.keySet());

        while (iterator.hasNext()){
            int key = iterator.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
    }
}
