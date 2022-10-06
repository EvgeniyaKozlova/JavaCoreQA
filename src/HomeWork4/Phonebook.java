package HomeWork4;

        /*Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.*/


import java.util.*;
import java.util.stream.Collectors;

public class Phonebook {
        private static final HashMap<String, String> phonebook = new HashMap<String, String>();

        //addPB - добавляет запись по заданным номеру телефона и фамилии
        public static void addPB(String phone, String name) {
            phonebook.put(phone, name);
        }



    public static String[] getPhoneForName(String surname){
        List<String> result = new ArrayList<String>();
        for (Map.Entry entry : phonebook.entrySet()) {
            if (surname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("Фамилия не найдена");
        return result.toArray(new String[0]);
    }

    public Set<String> getPhoneForNameStream(String name){
        return phonebook.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), name))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }


}
