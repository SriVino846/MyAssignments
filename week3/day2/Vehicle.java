package week3.day2;

public class Vehicle {


		
		public void applyBrake() {
			
			System.out.println("Brake is applied");
		}

		public void soundHorn() {
			
			System.out.println("Move Please");
		}
		public static void main(String[] args) {
			
			Vehicle v = new Vehicle();
			v.applyBrake();
			v.soundHorn();
		}

}
