package Practic7;

public class WeatherResponse {
}


    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResponse WeatherResponseFromFile = objectMapper.readValue(new File("weather.json"), WeatherResponse.class);
        System.out.println(WeatherResponseFromFile.toString());
    }

    console output >> Weather{temperature='  C', city =' '}
