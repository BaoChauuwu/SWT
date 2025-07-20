package com.chaude180529.example;
import java.io.*;
import java.util.logging.Logger;

public class PathTraversal {
    public static void main(String[] args) throws IOException {
        String userInput = "../secret.txt";
        File file = new File(userInput);
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println("Reading file: " + file.getPath());
            reader.close();
        }
    }
}


