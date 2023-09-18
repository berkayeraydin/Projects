package org.training.java.advanced.properties;

import org.training.java.advanced.reflection.Prop;
import org.training.java.advanced.reflection.PropConf;
import org.training.java.advanced.reflection.PropFile;

@PropConf(file = "my.properties",prefix = "app")
public class AppProp2 {
    private String info;
    private String version;
    private String commit;
    private int port;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "AppProp{" +
                "info='" + info + '\'' +
                ", version='" + version + '\'' +
                ", commit='" + commit + '\'' +
                ", port=" + port +
                '}';
    }
}
