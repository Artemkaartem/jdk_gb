package ru.gb;

import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        System.out.println("=".repeat(26) + "\n" +
                "| Cправочник сотрудников | \n" +
                "=".repeat(26));
        System.out.println("Выберите необходимый пункт меню: \n" +
                "1 - Вывести список сотрудников\n" +
                "2 - Добавить нового сотрудника\n" +
                "3 - Поиск сотрудника по стажу\n" +
                "4 - Поиск сотрудника по имени\n" +
                "5 - Поиск сотрудника по табельному номеру\n" +
                "6 - Удалить контакт\n" +
                "7 - Записать в файл\n" +
                "q - Выход из программы");
    }

    public void pressEnter(){
        System.out.println("Enter для продолжения...");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
    }
}
