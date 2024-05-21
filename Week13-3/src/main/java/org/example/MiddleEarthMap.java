package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MiddleEarthMap {
    private ArrayList<String> locations;

    public MiddleEarthMap(){
        loadLocations("map.txt"); // Intentional error: Missing map.txt file handling
    }

    public ArrayList<String> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    private void loadLocations(String fileName) {
        if (fileName.equals("")) throw new RuntimeException("File is empty");
        locations = new ArrayList<String>();
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        while (scanner.hasNextLine()) {
            locations.add(scanner.nextLine());
        }



    }
}
