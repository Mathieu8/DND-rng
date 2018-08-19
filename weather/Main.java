import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("which climate, Cold: \"c\", temperate \"t\", hot \"h\"");
	String climate =  input.next();
	System.out.println("which season, winter \"w\", spring \"s\", summer \"s\", autum \"a\",");
	String season =  input.next();
	Main m = new Main();
	m.weatherSwitch(climate, season);
	
	}
	
	public void weatherSwitch(String climate, String season) {
		char climateChar = climate.charAt(0);
		switch (climateChar) {
		case 'c':
		case 'C':
			
			break;
		case 't':
		case 'T':
			break;
		case 'h':
		case 'H':
			break;
			
			
			
		
		}
	}
}
