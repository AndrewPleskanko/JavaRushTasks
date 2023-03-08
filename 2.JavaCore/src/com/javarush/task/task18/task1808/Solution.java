package com.javarush.task.task18.task1808;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String fileName1 = scan.nextLine();
        String fileName2 = scan.nextLine();
        String fileName3 = scan.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);
        FileOutputStream outputStream1 = new FileOutputStream(fileName3);

        int fileSize = fileInputStream.available();
        int part1Size = fileSize % 2 == 0 ? fileSize / 2 : fileSize / 2 + 1;

        while (fileInputStream.available() > 0) {
            byte[] buf1 = new byte[part1Size];
            byte[] buf2 = new byte[fileSize - part1Size];

            fileInputStream.read(buf1);
            fileInputStream.read(buf2);
            outputStream.write(buf1);
            outputStream1.write(buf2);
        }
        fileInputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}

