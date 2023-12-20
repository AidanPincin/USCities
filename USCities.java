import java.text.DecimalFormat;
import java.util.*;

public class USCities {
    String[] cities = {"New York City", "Los Angeles","San Antonio","San Diego","San Jose" ,"Chicago", "Houston" ,"Phoenix" ,"Philadelphia","Dallas"};
    int[] population = {8622357, 4085014,1579504,1469490,1036242,2670406,2378146, 1743469,1590402,1400337};
    static Scanner input = new Scanner(System.in);

    void findPopulation(int p){
        System.out.println("\nList of cities with more than "+new DecimalFormat(",###").format(p)+" population\n");
        // List cities in numbered format
        int listNumber = 1;
        for(int i=0; i<population.length; i++){
            if(population[i]>p){
                System.out.println(listNumber+". "+cities[i]);
                listNumber++;
            }
        }
    }

    void findCities(char c){
        // List cities in numbered format
        int listNumber = 1;
        System.out.println("\nList of city names starting with "+c);
        for(String city: cities){
            if(city.charAt(0) == c){
                System.out.println(listNumber+". "+city);
                listNumber++;
            }
        }
    }

    void display(){
        System.out.println("List of U.S. cities with their population");
        System.out.println("Cities                Population");
        for(int i=0; i<cities.length; i++){
            System.out.print(cities[i]);
            //determines spacing of population numbers so that all population numbers are alligned
            for(int s=0; s<22-cities[i].length(); s++){
                System.out.print(" ");
            }
            // formats the number to add commas
            System.out.println(new DecimalFormat(",###").format(population[i]));
        }
    }

    public static void main(String[] args){
        USCities cit = new USCities();
        // User inputs character and pop to filter by
        System.out.println("Enter a character to filter the cities by: ");
        char c = input.nextLine().toUpperCase().charAt(0);
        System.out.println("Enter a population number to filter the cities by: ");
        int pop = input.nextInt();
        // Displays everything
        cit.display();
        cit.findPopulation(pop);
        cit.findCities(c);
    }
}
