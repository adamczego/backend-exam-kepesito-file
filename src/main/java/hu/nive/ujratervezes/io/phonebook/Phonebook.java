package hu.nive.ujratervezes.io.phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;



public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {

        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }

        try(FileWriter fileWriter = new FileWriter(output)) {

            contacts.forEach((name, phoneNumber) -> {
                try {
                    fileWriter.append(name + ": " + phoneNumber + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}