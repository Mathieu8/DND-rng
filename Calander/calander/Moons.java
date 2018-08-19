package calander;

public class Moons {
	Calander c;
	int periodN = 746130;
	int periodP = 33; // 3 11
	int periodF = 14; // 2 3 7 11
	int periodW = 15; // 2 3 5 7 11
	int periodA = 17; // 2 3 5 7 11 17
	int periodE = 19; // 2 3 5 7 11 17 19

	int phaseN;
	int phaseP;
	int phaseF;
	int phaseW;
	int phaseA;
	int phaseE;

	public Moons(Calander c) {
		this.c = c;
		phaseN = c.getDaysFromYearZero() % periodN;
		phaseP = c.getDaysFromYearZero() % periodP;
		phaseF = c.getDaysFromYearZero() % periodF;
		phaseW = c.getDaysFromYearZero() % periodW;
		phaseA = c.getDaysFromYearZero() % periodA;
		phaseE = c.getDaysFromYearZero() % periodE;

	}

	public void newDay(int n) {
		if (n >= 0) {
			phaseN = (phaseN + n) % periodN;
			phaseP = (phaseP + n) % periodP;
			phaseF = (phaseF + n) % periodF;
			phaseW = (phaseW + n) % periodW;
			phaseA = (phaseA + n) % periodA;
			phaseE = (phaseE + n) % periodE;

		}
	}

	public void printMoonN() {
		System.out.print("negative moon is");
		if (phaseN < periodN / 8) {
			System.out.print("new  moon");
		} else if (phaseN < 2 * periodN / 8) {
			System.out.print("Waxing crescent");
		} else if (phaseN < 3 * periodN / 8) {
			System.out.print("First quarter");
		} else if (phaseN < 4 * periodN / 8) {
			System.out.print("Waxing gibbous");
		} else if (phaseN < 5 * periodN / 8) {
			System.out.print("Full moon");
		} else if (phaseN < 6 * periodN / 8) {
			System.out.print("Waning gibbous");
		} else if (phaseN < 7 * periodN / 8) {
			System.out.print("Third quarter ");
		} else if (phaseN < 8 * periodN / 8) {
			System.out.print("Waning crescent");
		}
		System.out.println();
	}

	public void printMoonF() {
		System.out.print("Fire moon is ");
		if (phaseF < periodF / 8) {
			System.out.print("new  moon");
		} else if (phaseF < 2 * periodF / 8) {
			System.out.print("Waxing crescent");
		} else if (phaseF < 3 * periodF / 8) {
			System.out.print("First quarter");
		} else if (phaseF < 4 * periodF / 8) {
			System.out.print("Waxing gibbous");
		} else if (phaseF < 5 * periodF / 8) {
			System.out.print("Full moon");
		} else if (phaseF < 6 * periodF / 8) {
			System.out.print("Waning gibbous");
		} else if (phaseF < 7 * periodF / 8) {
			System.out.print("Third quarter ");
		} else if (phaseF < 8 * periodF / 8) {
			System.out.print("Waning crescent");
		}
		System.out.println();
	}

}
