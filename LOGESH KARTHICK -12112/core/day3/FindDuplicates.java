package core.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates
{
	   static  List<Integer> findDuplicates(int[] arr) {
	    List<Integer> duplicates = new ArrayList<>();
	    Set<Integer> seen = new HashSet<>();
	    	    
	    for (int num : arr)
	    {
	      if (seen.contains(num)) 
	      {
	        duplicates.add(num);
	      } else 
	      {
	        seen.add(num);
	      }
	    }
	    return duplicates;
	  }
	  public static void main(String[] args) 
	  {
	    int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
	    System.out.println("The duplicate elements in the array are: " + findDuplicates(arr));
	  }
	}



