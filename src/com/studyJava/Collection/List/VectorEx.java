package com.studyJava.Collection.List;
import java.util.*;
import com.studyJava.Collection.Object.Board;

public class VectorEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			Board b = list.get(i);
			//System.out.println(b.sub + b.content + b.writer);
		}
	}

}
