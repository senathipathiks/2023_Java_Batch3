package Com.Day4;


class Vehicle{ // superclass
		void noOfEngine() {
				System.out.println("I have one engine");
			}
		}

		class TwoWheeler1 extends Vehicle{ // subclass1
			void noOfWheels() {
				System.out.println("I have two wheels !");
			}
		}

		class FourWheeler extends Vehicle{ // subclass2
			void noOfWheels() {
				System.out.println("I have four wheels");
			}
		}


public class HeirarichalInheritance {
			
			public static void main(String[] args) {
				TwoWheeler1 two=new TwoWheeler1();
				two.noOfWheels();
				two.noOfEngine();
				
				FourWheeler four = new FourWheeler();
				two.noOfWheels();
				two.noOfEngine();
				
		}
		}



