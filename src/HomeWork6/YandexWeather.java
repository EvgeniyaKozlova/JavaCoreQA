package HomeWork6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;
import java.util.Properties;

public class YandexWeather {


    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        // Сегментированное построение URL
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("weather.yandex.ru")
                .addQueryParameter("X-Yandex-API-Key", "fb674fc9-f40f-4c5d-a2f7-7475b1e8239b")
                .addQueryParameter("lat", "59.93909836")
                .addQueryParameter("lon", "30.31587601")
                .addQueryParameter("lang", "ru_RU")
                .build();

        System.out.println(url.toString());


        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);
    }
}
