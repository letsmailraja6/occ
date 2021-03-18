package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(1,23,1,3,3,4,4,99,6,67,7,7,7,242,1,33435,546,675745,152,2,2,1,2,1,212,2,2,2,2,2,2,2,2,2,2,2,2,2,2);
		List<Integer> evenList=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)%2==0) {
				//System.out.println(list.get(i));
				evenList.add(list.get(i));
			}
		}
		System.out.println(evenList);
		
		System.out.println("Streams Demo");
		//Streams from Java8
		list.stream().forEach(x->System.out.println(x));
		System.out.println("Stream of even numbers");
		list.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		List<Integer> evenListStream=list.stream().filter(x->x%2==0).distinct().sorted().collect(Collectors.toList());
		System.out.println(evenListStream);
		
		List<String> fruits=Arrays.asList("Banana","Pomogranete","Mango","Apple","Kiwi","Orange","Muskmelon","Strawberry","Grape");
		List<String> fruits5LengthAndAbove=fruits.stream().filter(x->x.length()>=5).map(x->x.toUpperCase()).distinct().sorted().collect(Collectors.toList());
		System.out.println(fruits5LengthAndAbove);

	}

}

//Try these streams and explore about :: method reference operator
