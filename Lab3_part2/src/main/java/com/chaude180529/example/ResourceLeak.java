package com.chaude180529.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class ResourceLeak {

    private static final Logger logger = Logger.getLogger(ResourceLeak.class.getName());

    public static void main(String[] args) {
        // Use try-with-resources to ensure that the resource is automatically closed
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Use proper logging instead of printStackTrace()
            logger.severe("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
