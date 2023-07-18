package com.codinginterview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Read a File Example");
    }
    private static void readFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String str;
        while((str = br.readLine()) != null ){
            System.out.println(str);
        }
        br.close();
    }
    private static void readFile2(String path) throws IOException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
