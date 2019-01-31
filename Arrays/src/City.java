/**
 * A city object holds the name and population of a city.
 */
public class City {
	String name;
	int population;

	public City() {

	}

	public City(int p, String n) {
		name = n;
		population = p;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setPopulation(double population) {
		this.population = (int) population;
	}

	public int getPopulation() {
		return population;
	}
	
	@Override
	public String toString() {
		return getName() + ": " + getPopulation();
	}
}
