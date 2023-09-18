package org.training.design.patterns.structural.composite;

public class FileRun {

    public static void main(String[] args) {
        MyDir myDir = new MyDir("root").addSubFile(new MyFile("file1.txt",
                                                              100))
                                       .addSubFile(new MyFile("file2.txt",
                                                              100))
                                       .addSubFile(new MyFile("file3.txt",
                                                              100))
                                       .addSubFile(new MyDir("Subdir1").addSubFile(new MyFile("subdir1-file1.txt",
                                                                                              100))
                                                                       .addSubFile(new MyFile("subdir1-file2.txt",
                                                                                              100))
                                                                       .addSubFile(new MyDir("Subdir2").addSubFile(new MyFile("subdir2-file1.txt",
                                                                                                                              100))
                                                                                                       .addSubFile(new MyFile("subdir2-file2.txt",
                                                                                                                              100))));
    }
}
