package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    /*
    2. Если в конструктор передан txt-файл, TxtInputStream должен вести себя, как обычный FileInputStream.
    3. Если в конструктор передан не txt-файл, должно быть выброшено исключение UnsupportedFileNameException.
    4. В случае выброшенного исключения, так же должен быть вызван super.close().*/
    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        FileInputStream fileInputStream;
        if (fileName.endsWith(".txt")) {
            fileInputStream = new FileInputStream(fileName);
        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

