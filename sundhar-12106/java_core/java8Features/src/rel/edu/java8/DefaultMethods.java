package rel.edu.java8;

interface Smile{
	
	default void goodSmile() {
		System.out.println("Hello this is default Smile");
	}
	
	void fakeSmile();
	
	static void lazySmile() {
		System.out.println("Im lazy Smile");
	}
}

class FakeSmile implements Smile{

	@Override
	public void fakeSmile() {
		System.out.println("Here you go with a fake smile");
	}
	
}

class Person1 implements Smile{

	@Override
	public void fakeSmile() {

	}
	
	public void goodSmile() {
		System.out.println("im implemented");
	}
	
}

public class DefaultMethods {
	
	public static void main(String[] args) {
		
		Smile s = new FakeSmile();
		
		s.goodSmile();
		
		Smile.lazySmile();
	}

}
