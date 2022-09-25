package HomeWork1;

public class FoodGames {


    public static void main(String[] args) {
        Competitors [] comp = new Competitors[4];
        comp[0] = new Competitors("Василий", 3, 5);
        comp[1] = new Competitors("Борис", 5, 7 );
        comp[2] = new Competitors("Лариса", 6, 9);
        comp[3] = new Competitors("Николай", 4, 0);
        Team team = new Team("Обжорки", comp);

        Competition day1 = new Competition(5,8);
        String info = day1.round(team);
        System.out.println(info);



    }



}




