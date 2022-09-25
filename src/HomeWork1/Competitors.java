package HomeWork1;

public class Competitors {

    private String Name;
    private int eatenHotDogs;
    private int eatenBurgers;


    public Competitors(String Name, int eatenHotDogs, int eatenBurgers) {
        this.Name = Name;
        this.eatenHotDogs = eatenHotDogs;
        this.eatenBurgers = eatenBurgers;
    }



    public String getName() {
        return Name;
    }

    public int getEatenHotDogs() {
        return eatenHotDogs;
    }

    public int getEatenBurgers() {
        return eatenBurgers;
    }
}
