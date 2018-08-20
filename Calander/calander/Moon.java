package calander;

public class Moon {
	Calander c;
	int periodN = 746130;
	int periodP = 33; // 3 11
	int periodF = 14; // 2 3 7 11
	int periodW = 15; // 2 3 5 7 11
	int periodA = 17; // 2 3 5 7 11 17
	int periodE = 19; // 2 3 5 7 11 17 19
	int period;

	int phase;
	String p;
	private String name;

	public Moon(String name, int period, int daysFromyearZero, Calander c) {
		this.name = name;
		this.c = c;
		this.period = period;
		phase = c.getDaysFromYearZero() % period;

	}

	public void newDay(int n) {
		if (n >= 0) {
			phase = (phase + n) % period;
			if (phase < period / 8) {
				p = "NEW_MOON";
			} else if (phase < 2 * period / 8) {
				p = "WAXING_CRESCENT";
			} else if (phase < 3 * period / 8) {
				p = "FIRST_QUARTER";
			} else if (phase < 4 * period / 8) {
				p = "WAXING_GIBBOUS";
			} else if (phase < 5 * period / 8) {
				p = "FULL_MOON";
			} else if (phase < 6 * period / 8) {
				p = "WANING_GIBBOUS";
			} else if (phase < 7 * period / 8) {
				p = "THIRD_QUARTER";
			} else {
				p = "WANING_CRESCENT";
			}
		}
	}

	public void printMoon() {
		System.out.print(name + "moon is " + p);
		System.out.println();
	}

}
