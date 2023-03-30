import java.util.ArrayList;

public class City {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public static void main(String[] args) {
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(new City("New York", 8398748));
        cityList.add(new City("Los Angeles", 3990456));
        cityList.add(new City("Chicago", 2705994));

        for (City city : cityList) {
            System.out.println(city.getName() + " - " + city.getPopulation());
        }
      
        City cityToUpdate = cityList.get(1);
        cityToUpdate.setPopulation(cityToUpdate.getPopulation() + 100000);

        System.out.println("\nUpdated Information:");
        for (City city : cityList) {
            System.out.println(city.getName() + " - " + city.getPopulation());
        }
    }
}
