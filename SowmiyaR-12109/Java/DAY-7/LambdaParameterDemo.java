package Day7;

interface Drawable{
	void Draw();
}
public class LambdaParameterDemo {

	public static void main(String[] args) {
	var width=10;
	
	//Using Local-variable syntax for lamda parameters(JEP 323
	Drawable d1=()->{
		var localVar=width; //'var' infers the type from the context
		System.out.println("Drawing:"+localVar);
	};
	d1.Draw();

	}

}
