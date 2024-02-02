package Day7;
interface Drawable {
    void draw();
}

public class var1 {

    public static void main(String[] args) {
        int width = 10;   

        // Using Local-Variable Syntax for Lambda Parameters (JEP 323)
        Drawable d1 = () -> {
            var localVar = width; // 'var' infers the type from the context
            System.out.println("Drawing:"+localVar);
        };

        d1.draw();
    }
}