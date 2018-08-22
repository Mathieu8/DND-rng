package calander;

public class Calander {
	int year = 0;
	int day = 0;
	int daysFromYearZero = year * 360 + day;
	Moon fire = new Moon("fire", 14, daysFromYearZero, this);
	Moon water = new Moon("water", 15, daysFromYearZero, this);
	Moon air = new Moon("air", 17, daysFromYearZero, this);
	Moon earth = new Moon("earth", 19, daysFromYearZero, this);
	Moon positive = new Moon("positive", 33, daysFromYearZero, this);
	Moon negative = new Moon("negative", 746130, daysFromYearZero, this);
	
	int periodN = 746130;
	int periodP = 33; // 3 11
	int periodF = 14; // 2 3 7 11
	int periodW = 15; // 2 3 5 7 11
	int periodA = 17; // 2 3 5 7 11 17
	int periodE = 19; // 2 3 5 7 11 17 19

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
