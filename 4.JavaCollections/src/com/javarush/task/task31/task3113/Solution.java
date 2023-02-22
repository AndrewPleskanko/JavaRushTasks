package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileDirectory = reader.readLine();
        Path pth = Paths.get(fileDirectory);

        if (!Files.isDirectory(pth)) {
            System.out.printf(pth.toAbsolutePath().toString() + " - не папка");
            return;
        }

        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Files.walkFileTree(pth, myFileVisitor);

        System.out.println("Всего папок - " + myFileVisitor.folderNumber);
        System.out.println("Всего файлов - " + myFileVisitor.fileNumber);
        System.out.println("Общий размер - " + myFileVisitor.totalSize);

    }

    static class MyFileVisitor extends SimpleFileVisitor<Path> {
        int folderNumber = -1;
        int fileNumber = 0;
        int totalSize = 0;

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            folderNumber++;
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            fileNumber++;
            totalSize += Files.size(file);
            return FileVisitResult.CONTINUE;
        }

    }
}
