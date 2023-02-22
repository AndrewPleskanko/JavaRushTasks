package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

/* 
Проход по дереву файлов
*/

public class Solution {


    public static void main(String[] args) throws IOException {

        ArrayList<File> list = new ArrayList<>();
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File opa = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, opa);

        FileOutputStream fileWriter = new FileOutputStream(opa);
        Files.walkFileTree(path.toPath(), new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

                if (Files.isRegularFile(file)) {
                    if (attrs.size() <= 50) {
                        list.add(new File(file.toString()));
                    } else FileUtils.deleteFile(new File(file.toString()));
                }


                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        });

        for (File paths : list) {
            FileInputStream fileReader = new FileInputStream(paths);
            while (fileReader.available() > 0)
                fileWriter.write(fileReader.read());
            fileWriter.write(System.lineSeparator().getBytes());
            fileReader.close();
        }
        fileWriter.close();
    }
}

