package Day6;

import java.util.Arrays;

import java.util.List;
import java.util.function.Predicate;

public class FUnctionalInterfacePredicate {

    public static void main(String[] args) {
        List<String>names=Arrays.asList("Srini","Sundar","Jothi","Kiruba","Prashanth","Hema");
        
        Predicate<String>p=(s)->s.startsWith("S");
        
        for (String st : names) {
            if(p.test(st))
            System.out.println(st);
        }
    }

}
