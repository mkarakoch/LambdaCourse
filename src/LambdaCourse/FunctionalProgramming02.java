package LambdaCourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
	/*
	 	Method Referances: Class name  :: Method name without method pharantesis
	 	EX =>   			String 	   :: Length
	 						ArrayList  ::	size
	 */

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        printElStructured(l);
        System.out.println();
        printElfunctional(l);
        System.out.println();
        printSquareOdds(l);
        System.out.println();
        ProductOfCubeDistinctEvents(l);
        System.out.println();
        getMAxElement(l);
        System.out.println();
        getMinElement(l);
        System.out.println();
        greaterthen7even(l);
    	System.out.println();
		getHalfofDistinctElementReversed(l);
        
        
        
        
        
        
        

	}
	
	//1)Create a method to print the list elements 
	//on the console in the same line with a space 
	//between two consecutive elements.(Method Reference)

	// Notice: If Java has any method we prefer to use it, if Java does not have it we create the method inside Utils class and use it 
	public static void printElStructured(List<Integer> l) {
		l.stream().forEach(Utils::printIntheSameLineWithSpace);
	}
	//2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Method Reference)
	
	public static void printElfunctional(List<Integer> l) {
		l.stream().filter(Utils::checkToBeEven).forEach(Utils::printIntheSameLineWithSpace);
	}
	//3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.

	public static void printSquareOdds(List<Integer> l) {
		l.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printIntheSameLineWithSpace);
		
	}
	public static void printCubeOfDistinctOdds(List<Integer> l) {
		l.stream().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printIntheSameLineWithSpace);
		
	}

	
	public static void printSumOfSquaresDistinctEvens(List<Integer> l) {
		Integer sum = l.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0,Math::addExact);
		System.out.println("The sum of the squares of even distinct elements is " + sum );
		
		
	}
	
	//6)Create a method to calculate the product of the cubes of distinct even elements
	
		public static void ProductOfCubeDistinctEvents(List<Integer> l) {
			Integer prod = l.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).reduce(1, Math::multiplyExact);
			System.out.println("The multiplication of the cubes of even elements is " + prod);
		}
		
		//7)Create a method to find the maximum value from the list elements
		public static void getMAxElement (List<Integer> l) {
			Integer maxEL = l.stream().reduce(Integer.MIN_VALUE, Math::max);
			
			System.out.println("The MAX Value is " + maxEL);
			}
		
		//8)Create a method to find the Min value from the list elements
		public static void getMinElement (List<Integer> l) {
			Integer minEl = l.stream().reduce(Integer.MAX_VALUE, Math::min);
			System.out.println("The Min Value is " + minEl);
		}
		
		//9)Create a method to find the minimum value which is greater than 7 and even
		
		
		public static void greaterthen7even (List<Integer> l) {
			Integer minEl = l.stream().distinct().filter(t->t>7).filter(Utils::checkToBeEven).reduce(Integer.MAX_VALUE, Math::min);
			System.out.println("1) The min element after 7 is " + minEl);
		}
		
		public static void getHalfofDistinctElementReversed (List<Integer> l) {
			List<Double> resultList = l.stream().
									  distinct().
									  filter(t->t>5).
									  map(Utils::getHalf).
									  sorted(Comparator.reverseOrder()).
									  collect(Collectors.toList());
			
			System.out.println("Half of the elements list " + resultList);//[65.5, 7.5, 7.0, 6.0, 5.0, 4.5]
			
		
		}
}
