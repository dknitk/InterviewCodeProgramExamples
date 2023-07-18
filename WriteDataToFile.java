package com.codinginterview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class WriteDataToFile {
    public static void main(String[] args) {
        System.out.println("Write Data to the File");
    }
    private static void writetoFile1(String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello");
    }
}
