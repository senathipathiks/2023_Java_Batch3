package oops;
class CalculatorApplication{
    
    void Multipilcation() {
        System.out.println("Multiplication Operation");
    }
    
    double Multiplication(double a,double b) {        
        double result=a*b;
        System.out.println(result);
        return result;
    }
    
    int Mutiplication(int a,int b) {        
        int result=a*b;
        System.out.println(result);
        return result;
    }
    
    void Multiplication(float a,int b) {        
        float result=a*b;
        System.out.println(result);
    }
    
    void Multiplication(int a,float b) {
        double result=a*b;
        System.out.println(result);
    }

}

public class CalculationDriver {

    public static void main(String[] args) {
    CalculatorApplication ref=new CalculatorApplication();
    ref.Multipilcation();
    ref.Multiplication(2.6, 3.9);
    ref.Multiplication(9.26, 2);
    ref.Multiplication(2, 6.35);
    ref.Mutiplication(3, 5);

    }

}
