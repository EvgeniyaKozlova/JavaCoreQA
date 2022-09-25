package HomeWork1;

import java.util.Arrays;

public class Team {

    //Добавить класс Team, который будет содержать:
    //название команды;
    //массив из четырех участников — в конструкторе можно сразу всех участников указывать);
    //метод для вывода информации о членах команды, прошедших дистанцию;
    //метод вывода информации обо всех членах команды.

    private String teamName;
    private Competitors [] competitors;


    public Team(String teamName, Competitors[] competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }


    public String getTeamName() {
        return teamName;
    }

    public Competitors[] getCompetitors() {
        return competitors;
    }
}

