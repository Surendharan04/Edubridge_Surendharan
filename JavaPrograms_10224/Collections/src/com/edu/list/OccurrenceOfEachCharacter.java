package com.edu.list;

import java.io.*;
import java.util.*;


public class OccurrenceOfEachCharacter{
   static void count_characters(String input_str){
      HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();
      char[] str_array = input_str.toCharArray();
      
      
      for (char c : str_array){		//{'J','o','e',' ','E','r','i','e','n'}
         if (my_map.containsKey(c)){
            my_map.put(c, my_map.get(c) + 1);
         }else{
            my_map.put(c, 1);
         }
      }
      
      
      for (Map.Entry entry : my_map.entrySet()){
         System.out.println(entry.getKey() + " " + entry.getValue());
      }
   }
   
   public static void main(String[] args){
      String my_str = "Joe Erien ";
      System.out.println("The occurence of every character in the string is ");
      count_characters(my_str);
   }
}
