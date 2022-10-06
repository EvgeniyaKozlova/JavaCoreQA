package HomeWork4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        Phonebook.addPB("2304578", "Иванов");
        Phonebook.addPB("5479865", "Петров");
        Phonebook.addPB("5825784", "Сидоров");
        Phonebook.addPB("0578942", "Иванов");
        Phonebook.addPB("2887945", "Николаев");
        Phonebook.addPB("7849151", "Петров");


        System.out.println(Arrays.toString(Phonebook.getPhoneForName("Петров")));
        System.out.println(Arrays.toString(Phonebook.getPhoneForName("2887945")));


    }
}
