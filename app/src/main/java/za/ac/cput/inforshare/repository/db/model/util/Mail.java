package za.ac.cput.inforshare.repository.db.model.util;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

import java.time.LocalDateTime;

/**
 * Created by MUAMBA on 2/15/2018.
 */

@Entity(nameInDb = "Mail")
public class Mail {

    @Property(nameInDb = "siteId")
    private String siteId;

    @Property(nameInDb = "id")
    private String id;

    @Property(nameInDb = "key")
    private String key;

    @Property(nameInDb = "value")
    private String value;


    @Property(nameInDb = "host")
    private String host;

    @Property(nameInDb = "port")
    private String port;

    @Property(nameInDb = "state")
    private String state;

    @Property(nameInDb = "date")
    private LocalDateTime date;

    public Mail(String siteId, String id, String key, String value, String host, String port,
                String state, LocalDateTime date) {

        this.siteId = siteId;
        this.id = id;
        this.key = key;
        this.value = value;
        this.host = host;
        this.port = port;
        this.state = state;
        this.date = date;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

