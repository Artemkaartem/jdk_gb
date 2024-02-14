package ru.gb;

public class Calculator {

    public static <T1 extends Number, T2 extends Number> Number sum(T1 number1, T2 number2){
        return number1.doubleValue() + number2.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> Number multiply(T1 number1, T2 number2){
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> Number divide(T1 number1, T2 number2){
        return number1.doubleValue() / number2.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> Number substract(T1 number1, T2 number2){
        return number1.doubleValue() - number2.doubleValue();
    }
}