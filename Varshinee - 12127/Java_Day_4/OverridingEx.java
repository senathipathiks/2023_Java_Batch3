package Java_Day_4;

class Base{
    void display() {
        System.out.println("Base");
    }
}
class Base1 extends Base{
    void display() {
        System.out.println("Base 1");
    }
}
class Base2 extends Base1{
    void display() {
        System.out.println("Base 2");
    }
}
public class OverridingEx {

    public static void main(String[] args) {
        Base obj=new Base();
        obj.display();
        
        Base obj1=new Base1();
        obj1.display();
        
        Base obj2=new Base2();
        obj2.display();
        
        Base2 obj3=(Base2)(obj2);
        obj3.display();

    }

}



