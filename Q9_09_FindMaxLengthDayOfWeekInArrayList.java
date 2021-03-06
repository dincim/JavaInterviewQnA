package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;

public class Q9_09_FindMaxLengthDayOfWeekInArrayList {

//	9_09 Create a string ArrayList with days of the week then find the 
//		 day with most number of letters in it (longest String) 

	public static void main(String[] args) {
		
		ArrayList<String> daysOfWeek = new ArrayList<>(Arrays.asList
				("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
		
		String longestDay = "";
		
		for(String each : daysOfWeek) {
			if(each.length() > longestDay.length()) {
				longestDay = each;
			}
		}
		System.out.println(longestDay);
	}
}
