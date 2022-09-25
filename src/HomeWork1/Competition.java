package HomeWork1;

public class Competition {

    //Добавить класс Course (полоса препятствий), в котором будут находиться:
    //массив препятствий;
    //метод, который будет просить команду пройти всю полосу.

    private int eatingBur;
    private int eatingHD;

    private Competitors[] competitors;
    private int resultRound1;
    private int resultRound2;
    String info;


    public Competition(int eatingBur, int eatingHD) {
        this.eatingBur = eatingBur;
        this.eatingHD = eatingHD;
        this.competitors = competitors;
        this.resultRound1 = resultRound1;
        this.resultRound2 = resultRound2;

    }

    public String round(Team team) {
        info = "Команда " + team.getTeamName() + " " + '\n';
        for (Competitors competitors : team.getCompetitors()) {
            info += "Участник " + competitors.getName() + info + '\n';
            int HDAmount = competitors.getEatenHotDogs();
            int burAmount = competitors.getEatenBurgers();
            round1(HDAmount);
            round1(burAmount);
            resultOfDay();


        }
        return info;

    }


    private void round1(int HDAmount) {
        if (eatingHD > HDAmount) {
            int resultRound1 = 1;
        } else {
            int resultRound1 = 0;
        }

    }

    private void round2(int HDAmount) {
        if (eatingBur > HDAmount) {
            int resultRound1 = 1;
        } else {
            int resultRound1 = 0;
        }

    }

    private void resultOfDay() {
        if (resultRound1 == resultRound2) {
            info = "прошел испытание и переходит в финал";
        } else {
            info = "провалил испытание и выбывает";
        }


    }
}



