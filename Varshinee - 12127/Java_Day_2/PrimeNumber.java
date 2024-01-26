package Java_Day_2;



import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
              int n;
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the prime number range:");
              n=sc.nextInt();
              for(int i=1;i<n;i++) {
                  for (int j = 2; j < i; j++) {
                    
                
                  if( i%j==0) {
                    break;
                  }
                  else 
                      System.out.println(i);
                  break;
                
                  }
              }
              
    }

}