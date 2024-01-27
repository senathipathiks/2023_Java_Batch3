package Day6;
import java.util.*;
import java.util.stream.*;

public class StreamMethodEx1 {

    public static void main(String[] args) {
        
        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5); 
 
        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        
        //Display list
        System.out.println("Square List : "+square);
 
        // create a list of String
        List<String> names = Arrays.asList("Sanjay", "Surya", "Sathiya", "Prasanth", "Sundhar","Jothi");
 
        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
       
        System.out.println("List of names Starting with 'S' : "+result);
 
        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
       
        System.out.println("Sorted List : "+show);
 
        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2,3);
 
        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
       
        System.out.println("Using Set : "+squareSet);
 
        // demonstration of forEach method
        System.out.print("Using For Each method : ");
        number.stream().map(x -> x * x).forEach(y -> System.out.print(y+" "));
 
        // demonstration of reduce method
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
 
        System.out.println("\nUsing reduce method : "+even);

    }



}
