package HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class WeatherResponse {
    List<JsonObject> exampleObjects = new ArrayList<>();



    public WeatherResponse(List<JsonObject> exampleObjects) {
        this.exampleObjects = exampleObjects;
    }


    public List<JsonObject> getExampleObjects(){
        return exampleObjects;

    }

    public void setExampleObjects(List<JsonObject> exampleObjects) {
        this.exampleObjects = exampleObjects;
    }
}
