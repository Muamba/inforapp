package za.ac.cput.inforshare.repository.db.model.util;

import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MUAMBA on 2/15/2018.
 */


public class SmtpConfig {

    @Property(nameInDb = "port")
    private Integer port = 587;

    @Property(nameInDb = "host")
    private String host = "smtp.gmail.com";

    @Property(nameInDb = "user")
    private String user;

    @Property(nameInDb = "password")
    private String password;

    public SmtpConfig(Integer port, String host, String user, String password) {

        this.port = port;
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
