package calander;

public class Calander {
	int year = 0;
	int day = 0;
	int daysFromYearZero = year * 360 + day;
	Moons fire = new Moons("fire", 14, daysFromYearZero, this);

	public int getDaysFromYearZero() {
		// TODO Auto-generated method stub
		return daysFromYearZero;
	}

	public void newDay(int i) {
		fire.newDay(i);
		day = day + i;
		while (day > 360) {
			day = day - 360;
			year++;
		}
		daysFromYearZero = daysFromYearZero +i;

	}
}
