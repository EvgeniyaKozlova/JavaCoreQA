package HomeWork3.Exercise1;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        // Задача 1. Написать метод, который меняет два элемента массива местами.
        // (массив может быть любого ссылочного типа);
        String[] arr = {"asd", "ds", "ret", "123"};

        System.out.println("До изменения" + '\n' + Arrays.toString(arr));

        System.out.print("После изменения" + '\n');

        String g = arr [3];
        arr[3] = arr[1];
        arr[1] = g;
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }

    }

}