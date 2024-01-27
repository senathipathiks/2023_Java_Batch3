package Day6;

interface Sayable {
	void say();
}

public class InstanceMethodReferance {
	public void Something() {
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		// referring non static using reference
		InstanceMethodReferance methodreference = new InstanceMethodReferance();
		Sayable sayable = methodreference::Something;
		sayable.say();

		// using lambda
		Sayable sayable1 = () -> System.out.println("lambda");
		sayable1.say();
	}

}
