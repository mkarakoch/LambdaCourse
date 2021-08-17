package LambdaCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04 {

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
        
        		getSumOfAllElements (l);
                System.out.println();

				getSumOfIntFrom7To100A();
				System.out.println();
				getSumOfIntFrom7To100B();
				System.out.println();
				getMultiplicationofIntfrom2to11();
				System.out.println();
				factorialOfGivenNumber(-5);
				System.out.println();
				sumOfEveninGiven(4,11);
				System.out.println();
				//getSumOfDigitsOfInteger(123 ,127);//23->5, 24->6 , 25->7
				
				
				
				
                
                
            }
            //1)Create a method to find the sum of all elements in the list
            public static void getSumOfAllElements (List<Integer> l){
               Integer sum = l.stream().reduce(0, Math::addExact);
                System.out.println(sum); //80
            }
            //2)Create a method to find the sum of integers from 7 to 100
           
           //  1.st way
            public static void getSumOfIntFrom7To100A (){
              Integer sum =  IntStream.range(7,101).reduce(0,Math::addExact);
                System.out.println(sum);
            }
            
           // 2. way
            public static void getSumOfIntFrom7To100B() {
				
			
            Integer sum = IntStream.rangeClosed(7,100).sum(); // sum returns of element in this stream 
            
            System.out.println(sum);

            }
            public static void getMultiplicationofIntfrom2to11() {
            	
            	Integer result =IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
            	System.out.println(result);
            	
            }
            
          //4)Create a method to calculate the factorial of a given number.
            
            public static void factorialOfGivenNumber(int x) {
            	
           
            	
            	if(x<0) {
            		System.out.println("Please enter positive values");
            	}else {
            	Integer result = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
            	 System.out.println(result);
            }
           
		}
          //5)Create a method to calculate the sum of even integers 
            //between given two integers

            public static void sumOfEveninGiven(int s, int e) {
            	
            Integer result = IntStream.rangeClosed(s, e).filter(Utils::checkToBeEven).sum();
            	
            System.out.println(result);
				
			}
            
          //6)Create a method to calculate the sum of digits 
           //of every integers between given two integers
            
//            public static void getSumOfDigitsOfInteger(int s, int e) {
//           Integer result = IntStream.rangeClosed(s, e).map(Utils::getSumOfDigits).sum();
//				System.out.println(result);
//			}



}
        