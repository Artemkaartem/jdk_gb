package ru.gb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Reader {
    public void readFromFile(ArrayList contactsList){
        File file = new File("phonebook.txt");
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String id = Arrays.asList(line.split(",")).get(0);
                    String phoneNumber = Arrays.asList(line.split(",")).get(1);
                    String firstName = Arrays.asList(line.split(",")).get(2);
                    String experience = Arrays.asList(line.split(",")).get(3);
                    contactsList.add(new Contact(id, phoneNumber, firstName, experience));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
