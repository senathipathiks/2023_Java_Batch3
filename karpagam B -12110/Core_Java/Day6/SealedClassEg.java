package Com.Day6;


abstract sealed class Org permits Trainee,Trainers{ //sealed class must permits some other classes
	
}

final class Trainee extends Org{  
	
}

non-sealed class Trainers extends Org{// we can extend non sealed class from sealed class
	
}

public class SealedClassEg {

	public static void main(String[] args) {

	}

}
