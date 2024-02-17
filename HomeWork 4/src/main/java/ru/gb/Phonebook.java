package ru.gb;

import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
    public void addContact(ArrayList list) {
        System.out.println("Добавить новую запись?");
        System.out.println("q - Выход, Enter - продолжение");
        Scanner scn = new Scanner(System.in);
        while (true) {
            String input = scn.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                System.out.println("Введите табельный номер:");
                String id = scn.nextLine();
                System.out.println("Введите номер телефона:");
                String inputPhone = scn.nextLine();
                System.out.println("Введите Имя:");
                String inputFirstName = scn.nextLine();
                System.out.println("Введите стаж:");
                String inputExperience = scn.nextLine();
                System.out.println("q - Выход, Enter - продолжение");
                list.add(new Contact(id, inputPhone, inputFirstName, inputExperience));
            }
        }
    }

    public void deleteContact(ArrayList list){
        System.out.println("Введите порядковый номер контакта для удаления");
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        list.remove(in - 1);
    }

    public void searchContactByExp(ArrayList<Contact> list){
        System.out.println("Введите стаж сотрудника");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        for (Contact c : list) {
            if (c.getExperience().equals(input)) {
                c.print();
            }
        }
    }

    public void searchContactByName(ArrayList<Contact> list){
        System.out.println("Введите имя сотрудника");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        for (Contact c : list) {
            if (c.getFirstName().equals(input)) {
                c.print();
            }
        }
    }

    public void searchContactById(ArrayList<Contact> list){
        System.out.println("Введите табельный номер сотрудника");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        for (Contact c : list) {
            if (c.getId().equals(input)) {
                c.print();
            }
        }
    }
}