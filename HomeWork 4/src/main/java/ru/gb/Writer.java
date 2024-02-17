package ru.gb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer implements Writing{
    @Override
    public void writeToFile(ArrayList<Contact> contactsList) throws IOException {
        FileWriter writer = new FileWriter("phonebook.txt", false);
        for(Contact c  : contactsList) {
            writer.write(c.getId() + "," + c.getPhoneNumber() + "," + c.getFirstName() + "," + c.getExperience() + "\n");
        }
        writer.close();
    }
}
