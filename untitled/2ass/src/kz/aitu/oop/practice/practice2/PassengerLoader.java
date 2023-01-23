package kz.aitu.oop.practice.practice2;
import kz.aitu.oop.practice.practice2.Passenger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PassengerLoader {
    public static List<Passenger> loadFromTxt(String fileName) {
        List<Passenger> passengers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                int age = Integer.parseInt(parts[1]);
                String name = parts[2];
                boolean disability = Boolean.parseBoolean(parts[3]);
                passengers.add(new Passenger(id, age, name, disability));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return passengers;
    }
}


