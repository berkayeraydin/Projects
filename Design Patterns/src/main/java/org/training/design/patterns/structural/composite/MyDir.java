package org.training.design.patterns.structural.composite;

import java.util.ArrayList;

public class MyDir extends MyFile {

    public MyDir(String name) {
        super(name,
              0);
    }

    @Override
    public MyDir addSubFile(MyFile myFile) {
        if (subFiles == null){
            subFiles = new ArrayList<>();
        }
        subFiles.add(myFile);
        return this;
    }


}
