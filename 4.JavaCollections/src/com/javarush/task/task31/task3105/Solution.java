package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String pathToFileName = args[0];
        String pathToZipFile = args[1];

  /*      Path path = Paths.get(pathToFileName);
        ZipInputStream inputStream = new ZipInputStream(new FileInputStream("C://Users/legen/Desktop/result.mp3"));
        ZipOutputStream zipWriter = new ZipOutputStream(new FileOutputStream("C://Users/legen/Desktop/test.zip"));
        //ZipInputStream inputStream = new ZipInputStream(new FileInputStream(args[0]));
       // ZipOutputStream zipWriter = new ZipOutputStream(new FileOutputStream(args[1]));
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        zipWriter.write(buffer);
        ZipEntry zipEntry = new ZipEntry("new/" + "result.mp3");
        zipWriter.putNextEntry(zipEntry);
        Files.copy(file.toPath(), zipWriter);
        inputStream.close();
        zipWriter.closeEntry();
        zipWriter.close();*/
    }
}
