package HomeWork7;

import HomeWork7.enums.Periods;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class YandexWeatherProvider implements WeatherProvider{
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();

    public void getWeather(Periods periods) throws IOException {
        String cityKey = detectCityKey();
        if (periods.equals(Periods.NOW)) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host("weather.yandex.ru")
                    .addQueryParameter("X-Yandex-API-Key", "fb674fc9-f40f-4c5d-a2f7-7475b1e8239b")
                    .addQueryParameter("lat", "59.93909836")
                    .addQueryParameter("lon", "30.31587601")
                    .addQueryParameter("lang", "ru_RU")
                    .build();

            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());

            ObjectMapper mapper = new ObjectMapper();
            List<JsonObject> exampleObjects = new ArrayList<>();
            JsonObject exampleObject1 = new JsonObject();
            exampleObjects.add(exampleObject1);
            WeatherResponse example = new WeatherResponse(exampleObjects);
            String json = mapper.writeValueAsString(example);
            System.out.println("В городе" + selectedCity + exampleObject1);



        } else if(periods.equals(Periods.FIVE_DAYS)){
            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host("weather.yandex.ru")
                    .addQueryParameter("X-Yandex-API-Key", "fb674fc9-f40f-4c5d-a2f7-7475b1e8239b")
                    .addQueryParameter("lat", "59.93909836")
                    .addQueryParameter("lon", "30.31587601")
                    .addQueryParameter("lang", "ru_RU")
                    .build();

            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());

        }
    }



    public String detectCityKey() throws IOException {
        String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();

        HttpUrl detectLocationURL = new HttpUrl.Builder()
                .scheme("http")
                .host("weather.yandex.ru")
                .addQueryParameter("X-Yandex-API-Key", "fb674fc9-f40f-4c5d-a2f7-7475b1e8239b")
                .addQueryParameter("lat", "59.93909836")
                .addQueryParameter("lon", "30.31587601")
                .addQueryParameter("lang", "ru_RU")
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(detectLocationURL)
                .build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            throw new IOException("Невозможно прочесть информацию о городе. " +
                    "Код ответа сервера = " + response.code() + " тело ответа = " + response.body().string());
        }
        String jsonResponse = response.body().string();
        System.out.println("Произвожу поиск города " + selectedCity);

        if (objectMapper.readTree(jsonResponse).size() > 0) {
            String cityName = objectMapper.readTree(jsonResponse).get(0).at("/LocalizedName").asText();
            String countryName = objectMapper.readTree(jsonResponse).get(0).at("/Country/LocalizedName").asText();
            System.out.println("Найден город " + cityName + " в стране " + countryName);
        } else throw new IOException("Server returns 0 cities");

        return objectMapper.readTree(jsonResponse).get(0).at("/Key").asText();
    }
}

