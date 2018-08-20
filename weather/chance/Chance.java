package chance;

public class Chance {
	public int chance(int max) {
		return max * (int) Math.random();
	}
	
	public int bellCurve(int avarage, int sd) {
		int exp = - (chance(100) -avarage) *(chance(100) -avarage) /(2 *sd*sd); 
		int temp = (int) (1/(sd * Math.sqrt(2*Math.PI)) * Math.exp(exp));
		return temp;
	}
}
