package com.javarush.task.task35.task3512;

public class Generator<T> {
    Class<T> temp;

    public Generator(Class<T> temp) {
        this.temp = temp;
    }

    T newInstance() throws InstantiationException, IllegalAccessException {
        return (T) temp.newInstance();
    }
}
