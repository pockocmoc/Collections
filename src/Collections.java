/*
   Чтение из файла
 */



import java.io.*;
import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) throws Exception {
        FileInputStream stream = new FileInputStream("/home/marat/Загрузки/emsna_otkr_dan.csv");
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);

        String text = new String(data);

        ArrayList<String[]> lineWords = new ArrayList<>();

        String[] lines = text.split("\n");
        for (String line : lines) {
            String[] words = line.split(",");
            lineWords.add(words);

        }
        for (String[] words : lineWords) {
                for (String word : words) {
                    System.out.print(word);
                    System.out.print(" | ");
                }
                System.out.println("\n--------------------------------------");
            }

        }
    }

