package Practic7;

public class Controller {

    WeatherProvider weatherProvider = new AccuWeatherProvider();
    Map<Integar, Functionality> variantResult = new HashMap();

    public Controller() {
        variantResult.put(1, Functionality.GET_CURRENT_WEATHER);
        variantResult.put(2, Functionality.GET_WEATHER_5_DAYS);
    }

    public void onUserInput(String input) throws IOException {
        int command = Integar.parseInt(input);
        if (!variantResult.containsKey(command)) {
            throw new IOException("There is no command for commmand-key " + command);
        }

        switch (variantResult.get(command)) {
            case GET_CURRENT_WEATHER
                ;
                getCurrentWeather();
                break;
            case GET_WEATHER_5_DAYS
                ;
                break;
        }
    }

    public void getCurrentWeather() throws IOException {
        weatherProvider.getWeather(Periods.NOW);
    }
public void getWeather5days() {throw new RuntimeException("Implement in h/w")}
}