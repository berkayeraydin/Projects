package org.training.design.patterns.structural.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MyFile {
    List<MyFile> subFiles;
    MyFile       parent;
    String       name;
    int          length;

    public MyFile(String name,
                  int length) {
        this.name = name;
        this.length = length;
    }

    public MyFile addSubFile(MyFile myFile) {
        throw new IllegalStateException("Desteklenmiyor");
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", length=" + length ;
    }

    public String toMyString(int level) {
        StringBuilder stringBuilder = new StringBuilder();
        String currentTab = "\t";
        for (int i = 0; i < level; i++) {
            currentTab += "\t";
        }
        if (subFiles != null) {
            for (MyFile myFile : subFiles) {
                stringBuilder.append(currentTab);
                stringBuilder.append(myFile);
                stringBuilder.append("\n");
                stringBuilder.append(myFile.toMyString(++level));
            }
        }
        return stringBuilder.toString();
    }

}
