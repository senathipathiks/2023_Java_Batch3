package Day_1;
import java.util.*;
public class GradeSystem {
    
    private int studId;// instance variable
    private String studName;
    private String dept;
    private char gender;
    
    
    float mark1=0;
    float mark2=0;
    float mark3=0;
    
    Scanner sc = new Scanner(System.in);
    
    GradeSystem(int studId, String studName, String dept, char gender){ // local variables
        
        this.studId=studId;
        this.studName=studName;
        this.dept=dept;
        this.gender=gender;
    }
    
    public char grade() {
        System.out.println("Enter Physics Mark");
        mark1= sc.nextFloat();
        System.out.println("Enter Chemistry Mark");
        mark2 = sc.nextFloat();
        System.out.println("Enter Maths Mark");
        mark3= sc.nextFloat();
        
        float grade1 = (mark1+mark2+mark3)/30;
        if (grade1 > 9 && grade1 < 10) {
            return 'A';
            
        } else if (grade1 > 8 && grade1 < 9){
            return 'B';
        }
        
        else if(grade1 > 7 && grade1 < 8) {
            return 'C';
        }
        
        else if(grade1 > 6 && grade1 < 7) {
            return 'D';
        }
        
        else if(grade1 > 5 && grade1 < 6) {
            return 'E';
        }
        
        else {
            return 'F';
        }
        
        
        
    }
    
    
    public static void main(String a[]) {
        
        GradeSystem s1 = new GradeSystem(121,"John","ECE",'M');
//        s1.grade();
        System.out.println("Grade:"+ s1.grade());
    }

}