package Day2;

class Animals {

	void makeNoise(String noiseType) {
		System.out.println(noiseType);
	}

	void liveIn(String livingType) {
		System.out.println(livingType);
	}

	class Monkey extends Animals {

	}

	class Tiger extends Animals {

	}

	public class Animal {
		public static void main(String[] args) {
			Animals ani = new Monkey();
			ani.liveIn("Tree");
		}
	}
}
