package HomeWork7;



import HomeWork7.enums.Periods;
import com.fasterxml.jackson.databind.JsonMappingException;


import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

}
