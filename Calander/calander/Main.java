package calander;

public class Main {

	public static void main(String[] args) {
		Calander c = new Calander();
		for (int i = 0; i < 100; i++) {
			c.newDay(1);
			System.out.print("Day = " + c.getDaysFromYearZero() + " ");
			c.moons.printMoonF();
		}
		// TODO Auto-generated method stub

	}

}
