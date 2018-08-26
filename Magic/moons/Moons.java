package moons;

import elements.Weather;

public abstract class Moons {
	public abstract Weather wind(Weather w);
	public abstract Weather temp(Weather w);
	public abstract Weather percip(Weather w);
	public abstract Weather weather(Weather w);

}
