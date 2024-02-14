package ru.gb;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("2 + 3 = " + Calculator.sum(2, 3));
        System.out.println("2 - 3 = " + Calculator.substract(2, 3));
        System.out.println("2 * 3 = " + Calculator.multiply(2, 3));
        System.out.println("2 / 3 = " + Calculator.divide(2, 3));
        System.out.println();

        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {1, 2, 3, 4};
        Integer[] array3 = {5, 6, 7, 8};
        String[] array4 = {"asd", "zxc", "qwe", "fgh"};

        System.out.println("Массивы " + Arrays.toString(array1) + " и " + Arrays.toString(array1) + " равны? " + compareArrays(array1, array2));
        System.out.println("Массивы " + Arrays.toString(array1) + " и " + Arrays.toString(array3) + " равны? " + compareArrays(array1, array3));
        System.out.println("Массивы " + Arrays.toString(array1) + " и " + Arrays.toString(array4) + " равны? " + compareArrays(array1, array4));
        System.out.println();


        Pair pair = new Pair(10, "test");
        System.out.println(pair);

    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }
}