package LambdaCourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalProgramming {

	/*
	  1- Lambda is Functional Proggraming
	  2- Functional Proggraming was added to Java in Java 8,
	  		before than we used to use Structured Proggraming 
	  		but after JAVA 8 we are now able to use Fungtional and Structural Proggraming 
	  3- Structured Proggraming focuses on "How to do" most of the times
	  4- Functional Programing focuses on what to do 
	  
	  
	  
	  
	  
	  
	 */
	
	
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(9);
		l.add(131);
		l.add(14);
		l.add(9);
		l.add(10);
		l.add(4);
		l.add(12);
		l.add(15);
	
		printElStructured(l);
		System.out.println();
		printElfunctional(l);
		System.out.println();
		printElEvenStructural(l);
		System.out.println();
		printElEvenfunctional(l);
		System.out.println();
		printSquareOdds(l);
		System.out.println();
		printCubeOfDistinctOdds(l);
		System.out.println();
		printSumOfSquares(l);
		System.out.println();
		ProductOfCubeDistinctEvents(l);
		System.out.println();
		getMAxElement(l);
		System.out.println();
		getMinElement(l);
		System.out.println();
		getMAxElement2(l);
		System.out.println();
		getMinElement2(l);
		System.out.println();
		greaterthen7even(l);
		System.out.println();
	//	greaterthen7even2(l);
		System.out.println();
		getMINgreaterthen7even2(l);
		System.out.println();
		getHalfofDistinctElementReversed(l);
	
		
		
		
		
		
		
	}

	
	/*1)Create a method to print the list elements on the console 
	 * in the same line with a space between two consecutive elements.
	  (Structured)
	
	*/
	
	public static void printElStructured(List<Integer> l) {
		
		for(Integer w: l) {
			System.out.print(w + " ");
			
		}
		
	}
	
	public static void printElfunctional(List<Integer> l) {
		l.stream().forEach(t->System.out.print(t + " "));
	}
	
	//2)Create a method to print the even list elements on the console 
	//in the same line with a space between two consecutive elements.(Structured)
	public static void printElEvenStructural(List<Integer> l) {
	for (Integer w : l ) {
		if (w%2==0) {
			System.out.print(w + " ");
		}
	}
		
	}
	
	public static void printElEvenfunctional(List<Integer> l) {
		l.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
	
			// t->t%2==0 that structure called "Lambda Expression"
	}
	
	/*3)Create a method to print the square of odd list elements on the console 
	 * in the same line with a space between two consecutive elements.
	 
	*/
	
	public static void printSquareOdds(List<Integer> l) {
		l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t+" "));
		// map() is used to change the value of elements
		
	}
	
	//4)Create a method to print the cube of distinct odd list elements 
	//on the console in the same line with a space between two consecutive elements.
	
	public static void printCubeOfDistinctOdds(List<Integer> l) {
		l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t->System.out.print(t + " "));
		
	}
	
	//5)Create a method to calculate the sum of the squares 
	//of distinct even elements
	
	
	public static void printSumOfSquares(List<Integer> l) {
		Integer sum = l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
		System.out.println("The sum of the squares of even distinct elements is " + sum );
		
		
	}
	
	//6)Create a method to calculate the product of the cubes of distinct even elements
	
	public static void ProductOfCubeDistinctEvents(List<Integer> l) {
		Integer prod = l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (t,u)->t*u);
		System.out.println("The multiplication of the cubes of even elements is " + prod);
	}
	
	//7)Create a method to find the maximum value from the list elements
	public static void getMAxElement (List<Integer> l) {
		Integer maxEL = l.stream().reduce(Integer.MIN_VALUE, (t,u)->t>u ? t : u);
		
		System.out.println("The MAX Value is " + maxEL);
		
	}
	
	public static void getMAxElement2 (List<Integer> l) {
		//
		Integer maxEL =l.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u );
		System.out.println("The Max elements is (2)" + maxEL);
		
	}
	
	//8)Create a method to find the Min value from the list elements
	public static void getMinElement (List<Integer> l) {
		Integer minEl = l.stream().reduce(Integer.MAX_VALUE, (t,u)->t<u ? t : u);
		System.out.println("The Min Value is " + minEl);
		
	}
	public static void getMinElement2 (List<Integer> l) {
		Integer minEl= l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)->u);
		System.out.println("The Min Value is (2)" + minEl);
		
	}
		
	//9)Create a method to find the minimum value which is greater than 7 and even
	
	
	public static void greaterthen7even (List<Integer> l) {
		Integer minEl = l.stream().distinct().filter(t->t>7&&t%2==0).reduce(Integer.MAX_VALUE, (t,u)->t<u ? t:u);
		System.out.println("1) The min element after 7 is " + minEl);
	}
/*	
	public static void greaterthen7even2 (List<Integer> l) {
		Integer minEl=l.stream().distinct().filter(t->t>7&&t%2==0).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)->u);
		System.out.println("2) The min element is " + minEl);
		
	}
	
	*/
	
	public static void getMINgreaterthen7even2 (List<Integer> l) {
	Integer minEl = l.stream().
					  distinct().
					  filter(t->t>7 &&t%2==0).
					  sorted().
					  findFirst().
					  get();
		// use findfirst () together get() to get Integer return type
	
	System.out.println("2) The min element is " + minEl);
		
	}
	
	//10)Create a method to find the half of the elements 
	//which are distinct and greater than 5 in reverse order from the list.
	
	public static void getHalfofDistinctElementReversed (List<Integer> l) {
		List<Double> resultList = l.
									stream().
									distinct().
									filter(t->t>5).
									map(Utils::getHalf).
									sorted(Comparator.reverseOrder()).
									collect(Collectors.toList());
		
		System.out.println("Half of the elements list " + resultList);//[65.5, 7.5, 7.0, 6.0, 5.0, 4.5]
		
	
	
	}
	
	
	
	
	
	
	
	
}
