package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		List<Integer> lst1=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			lst.add(i);
		}
		
		for(int i:lst) {
			if(i>5) {
				lst1.add(i);
			}
		}

		System.out.println(lst1);
		
		//Using Stream
		Stream<Integer>lsm=lst.stream();
		
		List<Integer>anslst=lsm.filter(i->i>5).collect(Collectors.toList());
		System.out.println(anslst);
		
	}

}