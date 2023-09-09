package com.edu.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) { 
        List<Integer> list = new ArrayList<Integer>();  
        list.add(15);  
        list.add(87);  
        list.add(67);  
        list.add(52); 
        list.add(67);      
        
        Set<Integer> lhs = new LinkedHashSet<Integer>(list);  
        System.out.println(lhs);  
    }    
}

