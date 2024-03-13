package DAY1;

class Animals1
{
    public void makesound() 
    {
        System.out.println("The animal makes a sound like");
    }

}
class Dog extends Animals1
{

    public void makesound() 
    {
        System.out.println("The dog barks");
    }

}
class Cow extends Animals1
{
   
    public void makesound()
    {
        System.out.println("The cow moos");
    }

}
class Lion extends Animals1 
{
   
    public void makesound() 
    {
        System.out.println("The lion roars");
    }
 
   
    public static void main(String[] args)
    {
        Animals1 a = new Animals1();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Lion lion = new Lion();

        Animals1 animals1 = new Animals1();
		a.makesound();
        dog.makesound();
        cow.makesound();
        lion.makesound();
    }
    }

