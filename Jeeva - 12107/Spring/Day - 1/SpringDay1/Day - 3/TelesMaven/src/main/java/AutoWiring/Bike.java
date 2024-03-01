package AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	// this auto wired check like we need a tire so it will go to xml file in that it will got a instance for a tyre using bean
	@Autowired
	private Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	@Override
	public void ride() {
		System.out.println("car"+ tyre);
	}

	
	
	
	
	
	
}
