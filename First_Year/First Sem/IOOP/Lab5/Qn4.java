/*4. Design a Weather class with a static nested class Forecast. 
a) The Forecast class should predict weather conditions (Sunny, Rainy, Cloudy) based on 
input data like temperature and humidity. 
b) Use the nested class to predict and display the weather forecast for different cities.  */
import java.util.Scanner;

class Weather {

    static class Forecast {
        static String predict(double temp, double humidity) {
            if (temp > 30 && humidity < 60)
                return "Sunny";
            else if (humidity > 70)
                return "Rainy";
            else
                return "Cloudy";
        }
    }
}

public class Qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("City Name: ");
        String city = sc.nextLine();
        System.out.print("Temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Humidity: ");
        double hum = sc.nextDouble();

        String result = Weather.Forecast.predict(temp, hum);

        System.out.println("City: " + city);
        System.out.println("Weather Forecast: " + result);
    }
}
