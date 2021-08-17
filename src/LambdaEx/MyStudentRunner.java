package LambdaEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRunner {

	public static void main(String[] args) {

	      MyStudent st1=new MyStudent("Ramazan","Yesil","Math",35,97);
	      MyStudent st2=new MyStudent("Abuzer","Kadayif","Science",43,98);
	      MyStudent st7=new MyStudent("Albert","Einstain","Physics",40,91);
	      MyStudent st8=new MyStudent("John","Anderson","Biology",61,86);
	      MyStudent st4 = new MyStudent("Orcun", "Fazli", "Optician", 43, 70);
	      MyStudent st5 = new MyStudent("Ali", "Canli", "Driver", 30, 40);
	      MyStudent st3=new MyStudent("John","Brown","Art",40,93);
	      MyStudent st6=new MyStudent("Roney","Green","Computer",41,90);
	      List<MyStudent> list=new ArrayList<>();
	        list.add(st1);
	        list.add(st2);
	        list.add(st7);
	        list.add(st8);
	        list.add(st4);
	        list.add(st5);
	        list.add(st6);
	        list.add(st3);

	//checkAveGreaterThanScore(list,90);
	// System.out.println(listOfStudentsWhoseScoreBelow(list,90));
	        
	       // System.out.println(studentWithHighest(list));
	        System.out.println(SecondHighest(list));
	    }

	    //5) sort the list element acoording to the average score in ascending order and print just 3rd one.



	    //4)Sort the list elements according to the average score in ascending order and skip first 2 elements


		//6 Return student with the seconds highest score
	
		public static MyStudent SecondHighest (List<MyStudent> list) {
			
			return list.stream().sorted(Comparator.comparing(MyStudent::getScore)).skip(list.size()-2).findFirst().get();
			
		}
	
	
	
	
	
		
	
	
	
	
	
	
	
	    //5)Create a method to print the course whose average score is the highest
	public static MyStudent studentWithHighest ( List<MyStudent> list) {
		return list.stream().sorted(Comparator.comparing(MyStudent::getScore)).skip(list.size()-1).findFirst().get();
	}
	

	    //4 create a method to if at least one of the course names contains given word.
	    public static boolean doesCourseExist(List<MyStudent> list, String course){
	   return  list.stream().anyMatch(e->e.getMajor().equalsIgnoreCase(course));
	    }
	    
	    //3) Find the list of students whose age are below given age
	    public static List<String> listOfStudentsWhoseAgeBelow(List<MyStudent> l, int age){
	       List<String> names= l.stream().filter(e->e.getAge()<age).map(e->e.getFirstName()).collect(Collectors.toList());
	       return names;
	    }
	    
	    
	    //2 Print the list of the students name whose score is below a given score.
	    public static List<String> listOfStudentsWhoseScoreBelow(List<MyStudent> l, int score){
	      List<String> names= l.stream().filter(e->e.getScore()<score).map(e->e.getFirstName()).collect(Collectors.toList());
	      return names;
	    }


	    //1)Create a method to check if all average scores are greater than 91
	    public static boolean checkAveGreaterThanScore(List<MyStudent> l, int score){

	    boolean isGreater = l.stream().allMatch(e->e.getScore()>score);
	        System.out.println(isGreater);
	    return isGreater;
	    }
	    
	    
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    