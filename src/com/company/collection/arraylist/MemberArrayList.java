package com.company.collection.arraylist;

import com.company.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){
//        for(int i=0;i<arrayList.size(); i++){
//            Member member = arrayList.get(i);
//            int tempId = member.getMemberId();
//            if(memberId == tempId){
//                arrayList.remove(i);
//                return true;
//            }
//        }

        Iterator<Member> iterator = arrayList.iterator(); // How to use iterator (Iterator
        while (iterator.hasNext()){ // next element?
            Member member = iterator.next(); // get element, return member
            int tempId = member.getMemberId();
            if(memberId == tempId){
                arrayList.remove(member); // Delete Object
                return true;
            }
        }

        System.out.println(memberId+" is not found");
        return false;
    }

    public void showAll(){
        for(Member member:arrayList){
            System.out.println(member);
        }
        System.out.println(arrayList);
    }

}
