package LambdaCourse;

import java.util.List;

public class Utils {
	
	public static void printIntheSameLineWithSpace(Object o) {
		
			System.out.print(o + " ");
		
	}
	
	public static boolean checkToBeEven(int x) {
		return x%2==0;
		
	}
	public static boolean checkToBeOdd(int x) {
		return x%2!=0;
		
	}
	public static Integer getSquare(int x){
		return x*x;
	}
	public static Integer getCube(int x){
		return x*x*x;
	}

	public static Double getHalf(int x){
		return x/2.0;
	}
}