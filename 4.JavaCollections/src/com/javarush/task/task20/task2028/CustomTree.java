package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root = new Entry<>("Root");
    List<Entry<String>> list = new LinkedList<>();

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }

    public CustomTree() {
        list.add(root);
    }

    public String getParent(String s) {
        for (Entry<String> element : list){
            if (element.elementName != null) {
                if (element.elementName.equals(s)) {
                    if (element.parent.elementName != null) {
                        return element.parent.elementName;
                    } else {
                        return "у него совсем никого нет :\"(";
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return list.size() - 1;
    }

    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    public boolean add(String elementName) {
        Entry<String> entry = new Entry<>(elementName);

        for (Entry<String> element : list) {

            if (element.isAvailableToAddChildren()) {
                if (element.availableToAddLeftChildren) {
                    element.leftChild = entry;
                    element.availableToAddLeftChildren = false;
                    entry.parent = element;
                    list.add(entry);
                    return true;
                } else if (element.availableToAddRightChildren) {
                    element.rightChild = entry;
                    element.availableToAddRightChildren = false;
                    entry.parent = element;
                    list.add(entry);
                    return true;
                }
            }
        }
        return false;
    }

    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

}
