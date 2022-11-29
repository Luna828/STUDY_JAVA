package com.studyJava.Collection.Set;

import java.util.*;

import com.studyJava.Collection.Object.Member;

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("±Ë¿∫∞Ê", 25));
		set.add(new Member("±Ë¿∫∞Ê", 25));
		
		System.out.println("√—: " + set.size());
	}

}
