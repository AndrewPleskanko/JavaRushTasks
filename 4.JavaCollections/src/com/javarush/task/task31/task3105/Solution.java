package com.javarush.task.task31.task3105;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {

      /*  String fileName = "C:/Users/legen/Desktop/opa/file.txt";

        // Имя архива, в который нужно добавить файл
        String zipPath = "C:/Users/legen/Desktop/opa/test.zip";*/

        String fileName = args[0];

        // Имя архива, в который нужно добавить файл
        String zipPath =  args[1];
        String newFilePath = "new/" + Paths.get(fileName).getFileName().toString();

        // Создаем входной поток для чтения из архива
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipPath))) {
            // Создаем выходной поток для записи в архив
            try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipPath))) {
                // Создаем буфер для чтения содержимого файлов из архива
                byte[] buffer = new byte[1024];
                int len;
                // Проходимся по всем энтри в архиве
                ZipEntry entry;
                while ((entry = zipInputStream.getNextEntry()) != null) {
                    // Если это не тот файл, который мы хотим заменить
                    if (!entry.getName().equals(newFilePath)) {
                        // Копируем этот файл в выходной поток
                        zipOutputStream.putNextEntry(new ZipEntry(entry.getName()));
                        while ((len = zipInputStream.read(buffer)) > 0) {
                            zipOutputStream.write(buffer, 0, len);
                        }
                        zipOutputStream.closeEntry();
                    }
                }
                // Записываем новый файл в архив
                zipOutputStream.putNextEntry(new ZipEntry(newFilePath));
                Files.copy(Paths.get(fileName), zipOutputStream);
                zipOutputStream.closeEntry();
            }
        }
    }



      /*  String fileName = args[0];
        File file = new File(fileName);

        ZipInputStream inputStream = new ZipInputStream(new FileInputStream(args[0]));
        ZipOutputStream zipWriter = new ZipOutputStream(new FileOutputStream(args[1]));
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        zipWriter.write(buffer);
        ZipEntry zipEntry = new ZipEntry("new/" + file.getName());
        zipWriter.putNextEntry(zipEntry);
        Files.copy(file.toPath(), zipWriter);
        inputStream.close();
        zipWriter.closeEntry();
        zipWriter.close();
    }*/
}
