package org.training.java.advanced.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProp {
    public static void main(String[] args) throws Exception {
        File file = new File("my.properties");
        InputStream inputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(inputStream);
        AppProp appProp = new AppProp();
        appProp.setInfo(properties.getProperty("app.info"));
        appProp.setVersion(properties.getProperty("app.version"));
        appProp.setCommit(properties.getProperty("app.commit"));
        appProp.setPort(Integer.parseInt(properties.getProperty("app.port")));
    }
}
