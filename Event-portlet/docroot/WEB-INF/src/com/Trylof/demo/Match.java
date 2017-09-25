package com.Trylof.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Match {
	
	 private String [] data;
	 private String keyword;
	 public static int distance(String a, String b)

	    {

	        a = a.toLowerCase();

	        b = b.toLowerCase();

	        int[] costs = new int[b.length() + 1];

	        for (int j = 0; j < costs.length; j++)

	            costs[j] = j;

	        for (int i = 1; i <= a.length(); i++)

	        {

	            costs[0] = i;

	            int nw = i - 1;

	            for (int j = 1; j <= b.length(); j++)

	            {

	                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]),

	                        a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);

	                nw = costs[j];

	                costs[j] = cj;

	            }

	        }

	        return costs[b.length()];

	    }
       
	 public void getinput(String text)
	 {
		  data = text.split(" ");
	 }
	 
	 public void getkeyword(String text)
	 {
		  keyword = text;
	 }
     
	 public int compute(int count)
	 {
		 List<Integer> dist = new ArrayList<Integer>();

	        for (int i = 0; i < data.length; i++)

	        {

	            dist.add(distance(data[i], keyword));

	        }

	        Collections.sort(dist);

	        System.out.print("Did you mean: ");

	        for (int i = 0; i < data.length; i++)

	        {

	            if (distance(data[i], keyword) == dist.get(0))

	            {
	               count ++;
	                System.out.print(data[i] + " ");

	            }

	        }
	        return count;
	 }
	 
	 }

