package HomeWork3.Exercise2;

import java.util.Arrays;
import java.util.List;

public class FruitBoxes {
    public static void main(String[] args) {

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float appleWeight = appleBox.getWeight();
        System.out.println('\n' + "Вес коробки 1 с апельсинами: " + orange1Weight);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weight);
        System.out.println("Вес коробки с яблоками: " + appleWeight + '\n');

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox) + '\n');

        System.out.println("Содержимое коробок до пересыпания" + '\n');
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        orangeBox1.moveAt(orangeBox2);

        System.out.println('\n' + "Содержимое коробок после пересыпания" + '\n');
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }


}
